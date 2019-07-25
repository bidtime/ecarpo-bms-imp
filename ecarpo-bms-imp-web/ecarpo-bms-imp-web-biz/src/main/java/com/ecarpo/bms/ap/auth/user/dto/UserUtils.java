package com.ecarpo.bms.ap.auth.user.dto;

import java.util.Date;

import com.ecarpo.bms.ap.auth.user.UserLoginBO;
import com.ecarpo.framework.annotation.utils.DTOAnnoUtils;
import com.ecarpo.framework.model.BaseDTO;
import com.ecarpo.framework.model.InsertDTO;
import com.ecarpo.framework.model.UpdateDTO;

/**
 * 自动注入controller 方法中的 userID 注解参数
 * <p/>
 * 使用配置： <mvc:annotation-driven> <mvc:argument-resolvers>
 * <bean class= "com.zs.framework.CSessionResolver" /> </mvc:argument-resolvers>
 * </mvc:annotation-driven>
 * <p/>
 * Created by riverbo on 2016/9/6.
 */
public class UserUtils {

//  private static final UserLoginBO userI = UserLoginBO.getUser();
//  
//  private UserLoginBO getUser(HttpServletRequest req) {
//    UserLoginBO u = (UserLoginBO)UserSessionCommon.getUser(req);
//    if (u == null) {
//      u = userI;
//    }
//    return u;
//  }
  
  public static void copy(BaseDTO dto, UserLoginBO user) {
    if (dto instanceof InsertDTO) {
      copy((InsertDTO)dto, user, true);
    } else if (dto instanceof UpdateDTO) {
      copy((UpdateDTO)dto, user, true);
    }
  }
  
  public static void copy(InsertDTO dto, UserLoginBO user, boolean copyOrg) {
    // 初始化DTO类的默认值
    try {
      DTOAnnoUtils.process(dto);
    } catch (Exception e) {
    }
    Date dtNow = new Date();
    dto.setCreateTime(dtNow);
    dto.setModifyTime(dtNow);
    if (user == null) {
      return;
    } else {
      //dto.setUserContext(user);
      dto.setCreatorId(user.getUserId());
      dto.setModifierId(user.getUserId());
      dto.setCreatorName(user.getUserName());
      dto.setModifierName(user.getUserName());
//      if (copyOrg) {
//        if (dto instanceof InsertOrgDTO) {
//          InsertOrgDTO org = (InsertOrgDTO) dto;
//          org.setOrgId(user.getOrgId());
//          org.setOrgType(user.getOrgType());
//          org.setOrgCode(user.getOrgCode());
//          org.setOrgName(user.getOrgName());
//          if (dto instanceof InsertDealerDTO) {
//            InsertDealerDTO dealer = (InsertDealerDTO) dto;
//            dealer.setGroupId(user.getGroupId());
//            dealer.setGroupCode(user.getGroupCode());
//            dealer.setGroupName(user.getGroupName());
//          }
//        }
//      }
    }
  }
  
  public static void copy(UpdateDTO dto, UserLoginBO user, boolean copyOrg) {
    // 初始化DTO类的默认值
    try {
      DTOAnnoUtils.process(dto);
    } catch (Exception e) {
    }
    dto.setModifyTime(new Date());
    if (user == null) {
      return;
    } else {
      //dto.setUserContext(user);
      dto.setModifierId(user.getUserId());
      dto.setModifierName(user.getUserName());
//      if (copyOrg) {
//        if (dto instanceof UpdateOrgDTO) {
//          UpdateOrgDTO org = (UpdateOrgDTO) dto;
//          org.setOrgId(user.getOrgId());
//          org.setOrgType(user.getOrgType());
//          org.setOrgCode(user.getOrgCode());
//          org.setOrgName(user.getOrgName());
//          if (dto instanceof UpdateDealerDTO) {
//            UpdateDealerDTO dealer = (UpdateDealerDTO) dto;
//            dealer.setGroupId(user.getGroupId());
//            dealer.setGroupCode(user.getGroupCode());
//            dealer.setGroupName(user.getGroupName());
//          }
//        }
//      }
    }
  }

}
