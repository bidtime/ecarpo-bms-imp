package com.ecarpo.bms.erp.server.toeas.utils;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.message.SOAPHeaderElement;

import com.alibaba.fastjson.JSON;
import com.ecarpo.bms.erp.server.toeas.bo.ErpToEasBrandBO;
import com.ecarpo.bms.erp.server.toeas.bo.ErpToEasSerieBO;
import com.ecarpo.bms.erp.server.toeas.bo.ErpToEasTypeBO;
import com.ecarpo.bms.erp.server.toeas.bo.car.ErpToEasCarBO;
import com.ecarpo.bms.erp.server.toeas.bo.car.ErpToEasServiceCarBO;
import com.ecarpo.bms.erp.server.toeas.bo.cust.ErpToEasCustBO;
import com.ecarpo.bms.erp.server.toeas.bo.cust.ErpToEasCustCarBO;
import com.ecarpo.bms.erp.server.toeas.bo.cust.ErpToEasCustSalerBO;
import com.ecarpo.bms.erp.server.toeas.bo.cust.ErpToEasCustpersonBO;
import com.ecarpo.bms.erp.server.toeas.utils.send.SendToEASDTO;
import com.ecarpo.bms.erp.server.toeas.utils.send.SendToEASParam;

@SuppressWarnings("unused")
public class SendToEASUtils {

  public static <E> void main(String[] args) {
    String method = null;

    method = "serCustomer";
    //        method = "serVehicle";
    //            method = "serBrand";
    //            method = "serSeries";
    //    method = "serCarType";

    try {
      Service s = new Service();
      Call call = (Call) s.createCall();
      call.setOperationName("login");
      //      call.setTargetEndpointAddress("http://127.0.0.1:56898/ormrpc/services/EASLogin?wsdl");//开发本地
      call.setTargetEndpointAddress("http://192.168.22.174:6778/ormrpc/services/EASLogin?wsdl");//测试环境
      call.setReturnType(new QName("urn:client", "WSContext"));
      call.setReturnClass(WSContext.class);
      call.setReturnQName(new QName("", "loginReturn"));
      //超时
      call.setTimeout(Integer.valueOf(1000 * 600000 * 60));
      call.setMaintainSession(true);
      //登陆接口参数
      WSContext rs = (WSContext) call.invoke(new Object[] { "user", "", "eas", "cw", "l2", 1 });
      //清理
      call.clearOperation();
      //调用业务接口
      call.setOperationName(method);
      //      call.setOperationName("serCustomer");
      //      call.setOperationName("serVehicle");
      //      call.setOperationName("serBrand");
      //      call.setOperationName("serSeries");
      //      call.setOperationName("serCarType");
      //      call.setTargetEndpointAddress("http://127.0.0.1:56898/ormrpc/services/WSOpenServiceFacade?wsdl");//开发本地
      call.setTargetEndpointAddress(
          "http://192.168.22.174:6778/ormrpc/services/WSOpenServiceFacade?wsdl");//测试环境
      //      call.setReturnType(new QName("urn:lang.java", "String"));
      //      call.setReturnClass(String.class);

      call.setReturnQName(new QName("", method));
      //      call.setReturnQName(new QName("", "serCustomer"));
      //      call.setReturnQName(new QName("","serVehicle"));
      //      call.setReturnQName(new QName("", "serBrand"));
      //      call.setReturnQName(new QName("","serSeries"));
      //      call.setReturnQName(new QName("","serCarType"));

      call.setTimeout(Integer.valueOf(1000 * 600000 * 60));
      call.setMaintainSession(true);
      SOAPHeaderElement header = new SOAPHeaderElement("http://login.webservice.bos.kingdee.com",
          "SessionId", rs.getSessionId());
      call.addHeader(header);

      //品牌数据
      //                  sendBrand(call);

      //车系数据
      //                  sendSerie(call);

      //车型数据
      //      sendCarType(call);

      //客户档案
      sendCust(call);

      //车辆档案
      //            sendCar(call);

      //      for (ErpToEasSerieBO erpToEasSerieBO : list) {
      //        String jsonString = JSON.toJSONString(erpToEasSerieBO);
      //
      //        //接口参数
      //        String res = (String) call.invoke(new Object[] { jsonString });
      //        System.out.println(res);
      //
      //        ErpToEasMsg parseObject = JSON.parseObject(res, ErpToEasMsg.class);
      //
      //        System.out.println(JSON.toJSONString(parseObject));
      //
      //      }

    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  /**
   * @param call
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.12
   */
  private static void sendCust(Call call) throws Exception {

    String orgNumber = "02.LN102.07";
    String personNumber = "";
    String saler = "";
    
    ErpToEasCustBO bo = new ErpToEasCustBO();
    bo.setAdminUnit(orgNumber);
    bo.setCustType(2);
    bo.setFirstDate(new Date());
    bo.setName("周学忠");
    bo.setOtherNumber(285464121565L);
    bo.setPapersNum("31321as12313");
    bo.setPapersType(1);
    bo.setPhone("13536252856");

    //联系人信息
    List<ErpToEasCustpersonBO> persons = new ArrayList<>();
    ErpToEasCustpersonBO erpToEasCustpersonBO = new ErpToEasCustpersonBO();
    erpToEasCustpersonBO.setMain(1);
    erpToEasCustpersonBO.setPerson(personNumber);
    erpToEasCustpersonBO.setPhone("13536252856");

    persons.add(erpToEasCustpersonBO);
    bo.setPersons(persons);

    //销售顾问
    List<ErpToEasCustSalerBO> salers = new ArrayList<>();
    ErpToEasCustSalerBO erpToEasCustSalerBO = new ErpToEasCustSalerBO();
    erpToEasCustSalerBO.setBrandId(67541628411220014L);
    erpToEasCustSalerBO.setOrgUnitNumber(orgNumber);
    erpToEasCustSalerBO.setSaler(saler);
    salers.add(erpToEasCustSalerBO);
    bo.setSalers(salers);

    //车辆信息
    List<ErpToEasCustCarBO> vehicles = new ArrayList<>();
    ErpToEasCustCarBO erpToEasCustCarBO = new ErpToEasCustCarBO();
    erpToEasCustCarBO.setCarId(67628111263112056L);
    erpToEasCustCarBO.setCarTypeId(67628185763112056L);
    erpToEasCustCarBO.setCompanyNumber(orgNumber);
    vehicles.add(erpToEasCustCarBO);
    bo.setVehicles(vehicles);

    List<ErpToEasCustBO> list = new ArrayList<>();
    list.add(bo);
    for (ErpToEasCustBO erpToEasCustBO : list) {
      sendJson(call, erpToEasCustBO);
    }
    System.out.println("****************************");
    System.out.println(JSON.toJSONString(list));
  }

  /**
   * 车型数据
   * 
   * @param call
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.12
   */
  private static void sendCarType(Call call) throws Exception {

    ErpToEasTypeBO bo = new ErpToEasTypeBO();
    bo.setBrandId(67541628411220014L);
    bo.setCarserialId(67621203212410314L);
    bo.setCarTypeId(67628185763102974L);
    bo.setCarTypeName("2007款 2.0L 自动四驱经典版");

    ErpToEasTypeBO bo1 = new ErpToEasTypeBO();
    bo1.setBrandId(67541628411220042L);
    bo1.setCarserialId(67621203212410676L);
    bo1.setCarTypeId(67628185763112056L);
    bo1.setCarTypeName("2012款 4.3L 标准型");

    ErpToEasTypeBO bo2 = new ErpToEasTypeBO();
    bo2.setBrandId(67541628411220015L);
    bo2.setCarserialId(67621203212410153L);
    bo2.setCarTypeId(67628185763104291L);
    bo2.setCarTypeName("2008款 730Li经典版");

    ErpToEasTypeBO bo3 = new ErpToEasTypeBO();
    bo3.setBrandId(67541628411220014L);
    bo3.setCarserialId(67621203212410314L);
    bo3.setCarTypeId(67628185763122518L);
    bo3.setCarTypeName("2015款 2.0L 两驱经典版");

    List<ErpToEasTypeBO> list = new ArrayList<>();
    list.add(bo);
    list.add(bo1);
    list.add(bo2);
    list.add(bo3);

    for (ErpToEasTypeBO erpToEasTypeBO : list) {
      sendJson(call, erpToEasTypeBO);
    }

  }

  /**
   * 推送JSON
   * 
   * @param call
   * @param object
   * @throws RemoteException
   * @author xinbeibei
   * @since 2019.06.12
   */
  private static void sendJson(Call call, Object object) throws RemoteException {
    String jsonString = JSON.toJSONString(object);
    System.out.println("JSON 数据 : " + jsonString);

    //接口参数
    String res = (String) call.invoke(new Object[] { jsonString });
    System.out.println(res);

    ErpToEasMsg parseObject = JSON.parseObject(res, ErpToEasMsg.class);

    System.out.println(JSON.toJSONString(parseObject));
  }

  /**
   * 品牌数据
   * 
   * @return
   * @author xinbeibei
   * @throws Exception
   * @since 2019.06.12
   */
  private static void sendBrand(Call call) throws Exception {
    ErpToEasBrandBO bo = new ErpToEasBrandBO();
    bo.setBrandId(67541628411220014L);
    bo.setName("本田");
    bo.setNumber("B");

    ErpToEasBrandBO bo1 = new ErpToEasBrandBO();
    bo1.setBrandId(67541628411220015L);
    bo1.setName("宝马");
    bo1.setNumber("B");

    ErpToEasBrandBO bo2 = new ErpToEasBrandBO();
    bo2.setBrandId(67541628411220012L);
    bo2.setName("现代");
    bo2.setNumber("X");

    ErpToEasBrandBO bo3 = new ErpToEasBrandBO();
    bo3.setBrandId(67541628411220042L);
    bo3.setName("法拉利");
    bo3.setNumber("F");
    List<ErpToEasBrandBO> list = new ArrayList<>();
    list.add(bo);
    list.add(bo1);
    list.add(bo2);
    list.add(bo3);

    for (ErpToEasBrandBO erpToEasBrandBO : list) {
      sendJson(call, erpToEasBrandBO);
    }
  }

  /**
   * 车系数据
   * 
   * @return
   * @author xinbeibei
   * @throws Exception
   * @since 2019.06.12
   */
  private static void sendSerie(Call call) throws Exception {
    ErpToEasSerieBO bo = new ErpToEasSerieBO();
    bo.setBrandId(67541628411220012L);
    bo.setCarserialId(67621203212410051L);
    bo.setName("伊兰特");
    bo.setNumber("伊兰特");

    ErpToEasSerieBO bo0 = new ErpToEasSerieBO();
    bo0.setBrandId(67541628411220012L);
    bo0.setCarserialId(67621203212414496L);
    bo0.setName("伊兰特EV");
    bo0.setNumber("伊兰特EV");

    ErpToEasSerieBO bo1 = new ErpToEasSerieBO();
    bo1.setBrandId(67541628411220015L);
    bo1.setCarserialId(67621203212410153L);
    bo1.setName("7系");
    bo1.setNumber("7系");

    ErpToEasSerieBO bo2 = new ErpToEasSerieBO();
    bo2.setBrandId(67541628411220042L);
    bo2.setCarserialId(67621203212410676L);
    bo2.setName("California T");
    bo2.setNumber("California T");

    ErpToEasSerieBO bo3 = new ErpToEasSerieBO();
    bo3.setBrandId(67541628411220014L);
    bo3.setCarserialId(67621203212410314L);
    bo3.setName("CR-V");
    bo3.setNumber("CR-V");

    List<ErpToEasSerieBO> list = new ArrayList<>();
    list.add(bo);
    list.add(bo0);
    list.add(bo1);
    list.add(bo2);
    list.add(bo3);

    for (ErpToEasSerieBO erpToEasSerieBO : list) {
      sendJson(call, erpToEasSerieBO);
    }
  }

  /**
   * 车辆档案信息
   * 
   * @param call
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.19
   */
  private static void sendCar(Call call) throws Exception {
    
    String orgNumber = "02.LN102.07";
    String companyNumber = "01.BJ107.07";
    String personNumber = "";
    String customerNumber = "";
    
    List<ErpToEasCarBO> list = new ArrayList<>();

    ErpToEasCarBO erpToEasCarBO = new ErpToEasCarBO();
    List<ErpToEasServiceCarBO> services = new ArrayList<>();
    ErpToEasServiceCarBO ErpToEasServiceCarBO = new ErpToEasServiceCarBO();
    ErpToEasServiceCarBO.setOrgUnit(orgNumber);
    ErpToEasServiceCarBO.setPerson(personNumber);
    ErpToEasServiceCarBO.setServiceDate(new Date());
    services.add(ErpToEasServiceCarBO);
    erpToEasCarBO.setServices(services);
    erpToEasCarBO.setCarId(199474478517661696L);
    erpToEasCarBO.setCarTypeId(67628185763131461L);
    erpToEasCarBO.setCompany(companyNumber);
    erpToEasCarBO.setCustomer(customerNumber);
    erpToEasCarBO.setVin("L2CCA2B81JG408868");
    list.add(erpToEasCarBO);

    ErpToEasCarBO carBO = new ErpToEasCarBO();
    List<ErpToEasServiceCarBO> ser = new ArrayList<>();
    ErpToEasServiceCarBO ErpToEasBO = new ErpToEasServiceCarBO();
    ErpToEasBO.setOrgUnit(orgNumber);
    ErpToEasBO.setPerson(personNumber);
    ErpToEasBO.setServiceDate(new Date());
    ser.add(ErpToEasBO);
    carBO.setServices(ser);
    carBO.setCarId(199479972758110208L);
    carBO.setCarTypeId(67628185763132930L);
    carBO.setCompany(companyNumber);
    carBO.setCustomer(customerNumber);
    erpToEasCarBO.setVin("SALWA2BV9JA699709");
    list.add(carBO);

    for (ErpToEasCarBO bo : list) {
      sendJson(call, bo);
    }

  }

  /**
   * 推送工具
   * 
   * @param method
   * @param context
   * @throws Exception
   * @author xinbeibei
   * @since 2019.05.29
   */
  public static ErpToEasMsg send(String context, String method) throws Exception {

    Service s = new Service();
    Call call = (Call) s.createCall();
    call.setOperationName("login");
    //    call.setTargetEndpointAddress("http://127.0.0.1:56898/ormrpc/services/EASLogin?wsdl");//开发本地
    call.setTargetEndpointAddress("http://192.168.22.174:6778/ormrpc/services/EASLogin?wsdl");//测试环境
    call.setReturnType(new QName("urn:client", "WSContext"));
    call.setReturnClass(WSContext.class);
    call.setReturnQName(new QName("", "loginReturn"));
    //超时
    call.setTimeout(Integer.valueOf(1000 * 600000 * 60));
    call.setMaintainSession(true);
    //登陆接口参数
    WSContext rs = (WSContext) call.invoke(new Object[] { "user", "", "eas", "cw", "l2", 1 });
    //清理
    call.clearOperation();
    //调用业务接口
    call.setOperationName(method);
    //    call.setOperationName("serCustomer");
    //    call.setOperationName("serVehicle");
    //    call.setOperationName("serBrand");
    //    call.setOperationName("serSeries");
    //    call.setOperationName("serCarType");
    //    call.setTargetEndpointAddress("http://127.0.0.1:56898/ormrpc/services/WSOpenServiceFacade?wsdl");//开发本地
    call.setTargetEndpointAddress(
        "http://192.168.22.174:6778/ormrpc/services/WSOpenServiceFacade?wsdl");//测试环境
    //    call.setReturnType(new QName("urn:lang.java", "String"));
    //    call.setReturnClass(String.class);

    call.setReturnQName(new QName("", method));
    //    call.setReturnQName(new QName("", "serCustomer"));
    //    call.setReturnQName(new QName("","serVehicle"));
    //    call.setReturnQName(new QName("","serBrand"));
    //    call.setReturnQName(new QName("","serSeries"));
    //    call.setReturnQName(new QName("","serCarType"));

    call.setTimeout(Integer.valueOf(1000 * 600000 * 60));
    call.setMaintainSession(true);
    SOAPHeaderElement header = new SOAPHeaderElement("http://login.webservice.bos.kingdee.com",
        "SessionId", rs.getSessionId());
    call.addHeader(header);
    //接口参数
    String res = (String) call.invoke(new Object[] { context });

    System.out.println(res);

    ErpToEasMsg msg = JSON.parseObject(res, ErpToEasMsg.class);

    return msg;

  }

  /**
   * 推送通用工具
   * 
   * @param dto
   * @param params
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.07.04
   */
  public static ErpToEasMsg send(SendToEASDTO dto, SendToEASParam params) throws Exception {
    if (params == null) {
      ErpToEasMsg erpToEasMsg = new ErpToEasMsg();
      erpToEasMsg.setFlag(0);
      erpToEasMsg.setMsg("路径参数为空,发送失败");
      return erpToEasMsg;
    }

    //URL
    String loginUrl = params.getLoginUrl();
    String sendUrl = params.getSendUrl();
    String soapHeader = params.getSoapHeader();

    //数据参数
    String userName = params.getUserName();
    String password = params.getPassword();
    String slnName = params.getSlnName();
    String dcName = params.getDcName();
    String language = params.getLanguage();

    Integer dbType = Integer.parseInt(params.getDbType());

    //接收数据的方法名称
    String method = dto.getMethod();
    //推送数据JSON串
    String context = dto.getContext();

    Service s = new Service();
    Call call = (Call) s.createCall();
    call.setOperationName("login");
    call.setTargetEndpointAddress(loginUrl);//测试环境
    call.setReturnType(new QName("urn:client", "WSContext"));
    call.setReturnClass(WSContext.class);
    call.setReturnQName(new QName("", "loginReturn"));
    //超时
    call.setTimeout(Integer.valueOf(1000 * 600000 * 60));
    call.setMaintainSession(true);
    //登陆接口参数
    WSContext rs = (WSContext) call
        .invoke(new Object[] { userName, password, slnName, dcName, language, dbType });
    //清理
    call.clearOperation();
    //调用业务接口
    call.setOperationName(method);
    call.setTargetEndpointAddress(sendUrl);//测试环境

    call.setReturnQName(new QName("", method));

    call.setTimeout(Integer.valueOf(1000 * 600000 * 60));
    call.setMaintainSession(true);
    SOAPHeaderElement header = new SOAPHeaderElement(soapHeader, "SessionId", rs.getSessionId());
    call.addHeader(header);
    //接口参数
    String res = (String) call.invoke(new Object[] { context });

    System.out.println(res);

    ErpToEasMsg msg = JSON.parseObject(res, ErpToEasMsg.class);

    return msg;

  }

}
