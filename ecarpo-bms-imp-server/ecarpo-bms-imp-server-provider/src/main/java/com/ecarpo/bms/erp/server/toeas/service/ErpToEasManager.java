/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */

package com.ecarpo.bms.erp.server.toeas.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.ecarpo.bms.erp.server.toeas.dao.ErpToEasDAO;
import com.ecarpo.bms.erp.server.toeas.dao.ErpToEasMapper;
import com.ecarpo.bms.erp.server.toeas.dto.ErpToEasCheckQO;
import com.ecarpo.bms.erp.server.toeas.dto.ErpToEasQO;
import com.ecarpo.bms.erp.server.toeas.dto.SaveErpToEasDTO;
import com.ecarpo.bms.erp.server.toeas.entity.ErpToEasDO;
import com.ecarpo.bms.erp.server.toeas.enumbean.ErpToEasOperTypeEnum;
import com.ecarpo.bms.erp.server.toeas.enumbean.ErpToEasStateEnum;
import com.ecarpo.bms.erp.server.toeas.enumbean.ErpToEasTableNameEnum;
import com.ecarpo.bms.erp.server.toeas.utils.ErpToEasMsg;
import com.ecarpo.bms.erp.server.toeas.utils.SendToEASUtils;
import com.ecarpo.framework.cache.redis.ICacheCallBack;
import com.ecarpo.framework.cache.redis.RedisCacheUtils;
import com.ecarpo.framework.common.service.BaseDAOManager;
import com.ecarpo.framework.common.utils.DAOUtils;
import com.ecarpo.framework.data.domain.PageBO;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xinbeibei
 * @since 2019.05.28
 */
@Service
@Slf4j
public class ErpToEasManager extends BaseDAOManager<ErpToEasDAO, ErpToEasMapper, ErpToEasDO> {

  /**
   * 保存ERP TO EAS 数据
   * 
   * @param dto
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.05.28
   */
  public Long save(SaveErpToEasDTO dto) throws Exception {
    Long id = null;
    //    if (ErpToEasOperTypeEnum.INSERT.equals(dto.getOperType())) {
    //      ErpToEasDO cloneBean = DAOUtils.cloneBean(ErpToEasDO.class, dto);
    //      cloneBean.setState(ErpToEasStateEnum.ZC.getValue());
    //      id = dao.insertLong(cloneBean).longValue();
    //    } else if (ErpToEasOperTypeEnum.UPDATE.equals(dto.getOperType())) {
    //新增可能是已经存在的数据,此处统一做查重操作

    try {
      ErpToEasCheckQO checkQO = new ErpToEasCheckQO();
      checkQO.setTableName(dto.getTableName());
      checkQO.setTablePk(dto.getTablePk());
      checkQO.setOperType(dto.getOperType());

      List<Integer> states = new ArrayList<>();
      states.add(ErpToEasStateEnum.ZC.getValue());
      states.add(ErpToEasStateEnum.CSSB.getValue());
      states.add(ErpToEasStateEnum.TS.getValue());
      checkQO.setStates(states);

      ErpToEasDO easDO = dao.selectByTableName(checkQO);
      if (easDO == null) {
        //新建
        ErpToEasDO cloneBean = DAOUtils.cloneBean(ErpToEasDO.class, dto);
        cloneBean.setState(ErpToEasStateEnum.ZC.getValue());
        id = dao.insertLong(cloneBean).longValue();
      } else {
        //更新
        dto.setToId(easDO.getToId());
        ErpToEasDO cloneBean = DAOUtils.cloneBean(ErpToEasDO.class, dto);
        dao.updateSelective(cloneBean);
        id = easDO.getToId();
      }
    } catch (Exception e) {
      log.error("保存ERP数据到ERP_TO_EAS 表  失败,参数  :{}", JSON.toJSONString(dto));
      e.printStackTrace();
    }
    return id;
  }

  /**
   * 先从数据库获取,定时发送给eas数据
   * 
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.05.28
   */
  public Integer sendTOEas() throws Exception {

    //String tableName = ErpToEasTableNameEnum.BRAND.getName();
    Integer operType = ErpToEasOperTypeEnum.INSERT.getValue();
    //
    ErpToEasQO easQO = new ErpToEasQO();
    List<Integer> states = new ArrayList<>();
    states.add(ErpToEasStateEnum.ZC.getValue());
    states.add(ErpToEasStateEnum.CSSB.getValue());
    states.add(ErpToEasStateEnum.TS.getValue());
    easQO.setStates(states);
    easQO.setSize(10);
    easQO.setOperType(operType);


    //
    while (true) {
      
      //品牌
      easQO.setTableName(ErpToEasTableNameEnum.BRAND.getName());
      this.modelTOEAS(operType,easQO);
      
      //车系
      easQO.setTableName(ErpToEasTableNameEnum.SERIE.getName());
      this.modelTOEAS( operType,easQO);
      
      //新增变更新
      if (ErpToEasOperTypeEnum.INSERT.equals(operType)) {
        operType = ErpToEasOperTypeEnum.UPDATE.getValue();
        List<Integer> updateStates = new ArrayList<>();
        updateStates.add(ErpToEasStateEnum.ZC.getValue());
        updateStates.add(ErpToEasStateEnum.CSSB.getValue());
        easQO.setStates(updateStates);
        easQO.setOperType(operType);
      } else {
        operType = ErpToEasOperTypeEnum.INSERT.getValue();
        List<Integer> IntegerStates = new ArrayList<>();
        IntegerStates.add(ErpToEasStateEnum.ZC.getValue());
        IntegerStates.add(ErpToEasStateEnum.CSSB.getValue());
        IntegerStates.add(ErpToEasStateEnum.TS.getValue());
        easQO.setStates(IntegerStates);
        easQO.setOperType(operType);
      }
      //
    }
    //return 0;
  }

  /**
   * 分模块发送数据到eas
   * 
   * @param operType
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.04
   */
  private void modelTOEAS(Integer operType,ErpToEasQO easQO) throws Exception {
    //获取所有的新增数据信息(品牌.....)
    PageBO<ErpToEasDO> page = dao.pageByTable(easQO);
    if (CollectionUtils.isNotEmpty(page)) {
      Thread.sleep(1000L);
      for (ErpToEasDO u : page) {
        Thread.sleep(0);
        RedisCacheUtils.lockUnlock(String.valueOf(u.getToId()), u.getTableName(),
            new ICacheCallBack<Integer>() {

            @Override
            public Integer callback() throws Exception {
              int n = 0;
              if (ErpToEasOperTypeEnum.INSERT.equals(operType)) {
                //推送新增数据
                n = processInsert(u);
              } else if (ErpToEasOperTypeEnum.UPDATE.equals(operType)) {
                //推送更新数据
                n = processUpdate(u);
              }
              return n;
            }
          });
      }
      Thread.sleep(0);
    }
  }

  /**
   * 推送"更新数据"
   * 
   * @param erpToEasDO
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.05.29
   */
  private Integer processUpdate(ErpToEasDO erpToEasDO) throws Exception {
    ErpToEasCheckQO qo = new ErpToEasCheckQO();
    qo.setOperType(ErpToEasOperTypeEnum.INSERT.getValue());
    qo.setTablePk(erpToEasDO.getTablePk());
    ErpToEasDO toEasDO = dao.selectByTableName(qo);

    if (toEasDO != null && !ErpToEasStateEnum.TS.equals(toEasDO.getState())) {
      //"新增"的数据还存在,且未推送成功,不做此条更新
      return 0;
    }

    ErpToEasMsg msg = null;
    String resultMsg = "";
    try {
      //TODO 传输数据
      log.info("processUpdate, {}", erpToEasDO.getContext());
      msg = SendToEASUtils.send(erpToEasDO.getContext(),
          ErpToEasTableNameEnum.getMethod(erpToEasDO.getTableName()));
    } catch (Exception e) {
      log.error("processUpdate, {}", e.getMessage());
      String message = e.getMessage();
      resultMsg = message.substring(0, 200);
    }

    if (msg == null) {
      //推送失败
      this.updateResultMsg(erpToEasDO, resultMsg);
    } else {
      if (msg.getFlag() == 1) {
        //成功
        dao.deleteByPrimaryKey(erpToEasDO.getToId());
      } else {
        //失败
        resultMsg = msg.getMsg().substring(0, 200);
        this.updateResultMsg(erpToEasDO, resultMsg);
      }
    }

    return 1;
  }

  /**
   * 推送"新增"数据
   * 
   * @param erpToEasDO
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.05.29
   */
  private Integer processInsert(ErpToEasDO erpToEasDO) throws Exception {

    Thread.sleep(0);

    if (ErpToEasStateEnum.TS.equals(erpToEasDO.getState())) {
      //传输当前主键下"更新"的数据
      //获取更新的数据
      ErpToEasCheckQO qo = new ErpToEasCheckQO();
      qo.setOperType(ErpToEasOperTypeEnum.UPDATE.getValue());
      //qo.setTableName(tableName);
      qo.setTablePk(erpToEasDO.getTablePk());
      ErpToEasDO toEasDO = dao.selectByTableName(qo);
      if (toEasDO != null) {

        ErpToEasMsg msg = null;
        String resultMsg = "";
        try {

          //TODO 传输数据
          log.info("开始推送数据 : {}", toEasDO.getContext());
          msg = SendToEASUtils.send(toEasDO.getContext(),
              ErpToEasTableNameEnum.getMethod(toEasDO.getTableName()));
        } catch (Exception e) {
          e.printStackTrace();
          //更新失败原因 + 失败次数
          resultMsg = e.getMessage().substring(0, 200);
        }

        if (msg == null) {
          //推送失败
          //resultMsg = "推送失败,无返回信息";
          this.updateResultMsg(toEasDO, resultMsg);
        } else {
          if (msg.getFlag() == 1) {
            //成功之后清除数据       
            dao.deleteByPrimaryKey(toEasDO.getToId());
            dao.deleteByPrimaryKey(erpToEasDO.getToId());
          } else {
            //失败
            resultMsg = msg.getMsg().substring(0, 200);
            this.updateResultMsg(toEasDO, resultMsg);
          }
        }
      }
    } else {
      //先传输"新增",再"更新"
      ErpToEasMsg msg = null;
      String resultMsg = "";
      try {
        //TODO 传输数据
        log.info("开始推送数据 : {}", erpToEasDO.getContext());
        msg = SendToEASUtils.send(erpToEasDO.getContext(),
            ErpToEasTableNameEnum.getMethod(erpToEasDO.getTableName()));
      } catch (Exception e) {
        e.printStackTrace();
        //更新失败原因 + 失败次数
        String message = e.getMessage();
        resultMsg = message.substring(0, 200);
      }

      //"新增"失败,不传"更新",更新失败原因 + 次数
      //"新增"成功,传"更新"
      //"更新"失败,维护"新增"状态,"更新"的失败原因+ 次数
      if (msg == null) {
        //推送失败
        //resultMsg = "推送失败,无返回信息";
        this.updateResultMsg(erpToEasDO, resultMsg);
      } else {
        ErpToEasCheckQO qo = new ErpToEasCheckQO();
        qo.setOperType(ErpToEasOperTypeEnum.UPDATE.getValue());
        qo.setTableName(erpToEasDO.getTableName());
        qo.setTablePk(erpToEasDO.getTablePk());
        ErpToEasDO toEasDO = dao.selectByTableName(qo);
        if (msg.getFlag() == 1) {
          //成功
          if (toEasDO != null) {
            ErpToEasMsg updateMsg = null;
            String updateResultMsg = "";
            try {
              //TODO 传输数据
              log.info("开始推送数据 : {}", toEasDO.getContext());
              updateMsg = SendToEASUtils.send(toEasDO.getContext(),
                  ErpToEasTableNameEnum.getMethod(toEasDO.getTableName()));
            } catch (Exception e) {
              e.printStackTrace();
              //更新失败原因 + 失败次数
              String message = e.getMessage();
              updateResultMsg = message.substring(0, 200);
            }
            if (updateMsg == null) {
              //推送失败
              //resultMsg = "推送失败,无返回信息";
              this.updateResultMsg(toEasDO, updateResultMsg);
            } else {
              if (updateMsg.getFlag() == 1) {
                //推送成功,删除数据
                dao.deleteByPrimaryKey(toEasDO.getToId());
                dao.deleteByPrimaryKey(erpToEasDO.getToId());
              } else {
                //推送失败,更新"新增"状态
                //更新"新增"状态
                erpToEasDO.setState(ErpToEasStateEnum.TS.getValue());
                dao.updateSelective(erpToEasDO);
                this.updateResultMsg(toEasDO, updateResultMsg);
              }
            }
          } else {
            //没有"更新"的数据,清除"新增"的数据
            dao.deleteByPrimaryKey(erpToEasDO.getToId());
          }
        } else {
          //"新增"失败,"更新"的不能做
          this.updateResultMsg(erpToEasDO, resultMsg);
          if (toEasDO != null) {
            toEasDO.setState(ErpToEasStateEnum.TS.getValue());
            dao.updateSelective(toEasDO);
          }
        }
      }
      //      ErpToEasCheckQO qo = new ErpToEasCheckQO();
      //      qo.setOperType(ErpToEasOperTypeEnum.UPDATE.getValue());
      //      qo.setTableName(erpToEasDO.getTableName());
      //      qo.setTablePk(erpToEasDO.getTablePk());
      //      ErpToEasDO toEasDO = dao.selectByTableName(qo);
      //      if (flag) {
      //        boolean updateFlag = true;
      //        if (toEasDO != null) {
      //
      //          try {
      //
      //            //TODO 传输数据
      //
      //          } catch (Exception e) {
      //            e.printStackTrace();
      //            //更新失败原因 + 失败次数
      //            updateFlag = false;
      //            String message = e.getMessage();
      //             resultMsg = message.substring(0, 200);
      //            this.updateResultMsg(erpToEasDO, resultMsg);
      //          }
      //          if (updateFlag) {
      //            //成功之后清除数据       
      //            dao.deleteByPrimaryKey(toEasDO.getToId());
      //            dao.deleteByPrimaryKey(erpToEasDO.getToId());
      //          } else {
      //            //更新"新增"状态
      //            erpToEasDO.setState(ErpToEasStateEnum.TS.getValue());
      //            dao.updateSelective(erpToEasDO);
      //          }
      //        } else {
      //          //没有"更新"的数据,清除"新增"的数据
      //          dao.deleteByPrimaryKey(erpToEasDO.getToId());
      //        }
      //
      //      } else {
      //        //"新增"失败,"更新"的不能做
      //        if (toEasDO != null) {
      //          toEasDO.setState(ErpToEasStateEnum.TS.getValue());
      //          dao.updateSelective(toEasDO);
      //        }
      //      }
    }
    return 1;
  }

  /**
   * 回写传输失败信息 + 上传次数
   * 
   * @param erpToEasDO
   * @param resultMsg
   * @throws Exception
   * @author xinbeibei
   * @since 2019.05.29
   */
  private void updateResultMsg(ErpToEasDO erpToEasDO, String resultMsg) throws Exception {

    erpToEasDO.setState(ErpToEasStateEnum.CSSB.getValue());
    erpToEasDO.setResultMsg(resultMsg);
    Integer uploadNum = erpToEasDO.getUploadNum();
    uploadNum += 1;
    erpToEasDO.setUploadNum(uploadNum);
    dao.updateSelective(erpToEasDO);
  }

}
