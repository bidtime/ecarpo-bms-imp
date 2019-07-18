package com.ecarpo.bms.erp.server.toeas.utils.send;

import org.apache.commons.lang3.StringUtils;

import com.ecarpo.bms.erp.server.toeas.utils.ErpToEasMsg;
import com.ecarpo.bms.erp.server.toeas.utils.SendToEASUtils;
import com.ecarpo.framework.exception.ManagerException;

import lombok.Data;

/**
 * 推送工具
 * 
 * @author xinbeibei
 * @since 2019.07.04
 */
@Data
public class SendToEASServer {

  private SendToEASParam sendToEASParam;

  /**
   * 推送数据
   * 
   * @param context
   * @param method
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.07.04
   */
  public ErpToEasMsg send(SendToEASDTO dto) throws Exception {
    
    //数据校验
    if (dto == null) {
      //throw new RuntimeException("推送数据参数为空,推送异常,请检查");
      throw new ManagerException("推送数据参数为空,推送异常,请检查");
    }
    
    //推送的JSON 数据
    if (StringUtils.isBlank(dto.getContext())) {
      throw new ManagerException("推送数据EAS接收数据方法名称为空,推送异常,请检查");
    }
    
    //EAS接收推送的方法名称
    if (StringUtils.isBlank(dto.getMethod())) {
      throw new ManagerException("推送数据EAS接收数据方法名称为空,推送异常,请检查");
    }
    
    ErpToEasMsg send = SendToEASUtils.send(dto, sendToEASParam);
    return send;
  }

}
