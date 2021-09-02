package com.md.conf;

import com.md.BaseInteceper;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author xiaoqiang
 * @Date 2021/9/2 0002 15:18
 * @Version 1.0
 */
@Configuration
public class WebMvcConfigure extends WebMvcConfigurerAdapter {

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
//    super.addInterceptors(registry);
    registry.addInterceptor(new BaseInteceper()).addPathPatterns("/**");
//        .excludePathPatterns("/", "/rabbitTest/**",
//        "/node/openIdAuth/**", "/api/openApiAuth/**", "/followupAlone/**", "/api/wxChronicDoctor/**",
//        "/node/wxChronicDoctor/**", "/queryCurrentSoftVersion", "/json/**", "/api/noAuth/**", "/api/rfid/**",
//        "/api/location/**", "/error", "/404", "/download", "/api/process/diagnosisECGFromOut",
//        "/api/chest/diagnosisECGFromOut", "/handHx", "/regeistHxBath", "/sync/**", "/his/**", "/remoteVideo/**",
//        "/api/base/getCurrentTime", "/api/base/loadAllHospitalByCode", "/api/base/loadAllHospitalList",
//        "/api/process/createPectoralgiaIDForThird", "/api/process/updateCPPatient", "/rfidTest", "/handNihss/**",
//        "/showLargeCpc/**", "/showLarge/**", "/api/base/uploadFile", "/version/**",
//        "/api/process/queryHandEcgRecrds", "/stat", "/ysdHeartBeat", "/statData", "/statPatientList",
//        "/healthCheck", "/api/base/queryArrivalRelatedInfo", "/api/base/queryLargeScreenTimeLine",
//        "/api/base/queryHospitalLbs", "/node/stroke/record/**", "/node/chronic/record/**", "/api/wx/**",
//        "/node/h5/stroke/share/**", "/api/base/healthCheck", "/api/base/uploadFilePDF/**", "/node/stroke/share/**",
//        "/api/third/**", "/api/stroke/screen/queryStrokeArrivalRelatedInfo", "/api/wxYq/**", "/node/wxYq/**",
//        "/api/wxChronic/**", "/node/wxChronic/**", "/node/cpc/patientweb/toCustomizedPrint/**",
//        "/node/cpc/patientweb/html2pdfView/**", "/node/triage/record/observationRecord/**",
//        "/api/chest/initConData", "/api/joysuch/getSubscribeData", "/api/joysuch/saveSubscribeData",
//        "/websocket/**", "/node/trauma/record/toMedicalRecord/**", "/groovywebconsole/",
//        "/node/api/chronic/importExcel", "/ecgwork/ecgOutServlet", "/api/noAuth/queryChangeData",
//        "/api/noAuth/queryOutRecordStates", "/api/noAuth/updatePatientMessage", "/api/health/login",
//        "/api/emergency/v3/autoTriageSheetRest/**", "/api/emergency/v3/autoTriageSheet",
//        "/api/base/queryAllCountry", "/api/fedex/**", "/api/chronic/reserveBatchShift/**", "/api/web/shiftLogin/**",
//        "/api/web/shiftstatistic/**", "/external/**", "/api/chest/requestOtherModule/**", "/api/chronic/print/**",
//        "/api/chronic/screen/**", "/api/vehicle/notice/**", "/api/chest/vehicle/**", "/api/trauma/rdp/**",
//        "/api/base/up/**", "/node/cpc/patientweb/toCustomizedPrint/**", "/node/cpc/patientweb/printByRdpReport",
//        "/node/cpc/patientweb/syncJzfzData", "/node/cpc/manager/getPatientEmergencyV3",
//        "/api/v3/emergency/sendEmergencyData", "/api/v3/emergency/receiveEmergencyData",
//        "/api/v3/emergency/getAliCloudEmergencyData", "/api/emergency/v3/autoTriageSheetHrb",
//        "/api/stroke/zk/getExportReportData", "/node/stroke/zk/**", "/api/stroke/zk/ageAndSexAttackTime",
//        "/api/stroke/zk/getExportReportDitDntData", "/cpc/report/indicator/getIndicatorDetailDataFrReport",
//        "/cpc/report/indicator/fmc2ecg", "/cpc/report/indicator/indicatorStatisticsFrReport",
//        "/cpc/report/statisticsPreviewFrReport", "/api/chest/synEcgData", "/report/fineReport/**",
//        "/api/base/up/upFileFromOutside", "/api/followup/pse/allPses", "/api/followup/pse/getById/**",
//        "/api/chest/poct/insertPoctData", "/api/wx/noAuth/**", "/api/monitor/**", "/api/base/queryOtherHospitalHis",
//        "/api/chest/updateHisEcgDiagnosis", "/node/trauma/zk/**", "/api/triage/his/receiveTriageData",
//        "/api/triage/his/updateReceiveTriageData", "/screening/oss/uploadData/**", "/node/cpc/patientweb/pdfView",
//        "/api/web/health/manager/queryRecordsByBarcode/**",
//
//        // 医速达和ECGHD自动关联
//        "/cpc/patientweb/queryPatientListByName", "/api/chest/SyncEcgData2Chest"
//
//        // POCT打印
//        , "/api/cig/basic/queryCheckPatientPrintInfo", "/api/monitor/**", "/api/hwvoice/**",
//        "/api/strokeDataReport/reportToTestEnv","/api/stroke/screening/**");

    /** 定位服务 推送数据"/api/joysuch/saveSubscribeData" */
    // registry.addInterceptor(new SoftInterceptor())
    // .addPathPatterns("/api/emergency/pad/**", "/node/h5/emergency/pad/**")
    // .excludePathPatterns("/api/emergency/pad/bindDevice");
//    registry.addInterceptor(new WxInterceptor())
//        .addPathPatterns("/api/wxYq/**", "/api/wxChronic/**", "/node/wxYq/**", "/node/wxChronic/**",
//            "/api/wxChronicDoctor/**", "/node/wxChronicDoctor/**")
//        .excludePathPatterns("/api/wxYq/login", "/api/wxChronicDoctor/login", "/api/wxYq/sendValidCode",
//            "/api/wxYq/checkValidCode", "/api/wxChronicDoctor/getGzhJKTicketSignature", "/api/wxYq/register",
//            "/api/wxYq/forgetPassword", "/api/wxChronic/login", "/api/wxChronic/register",
//            "/api/wxYq/improveBasicInformation", "/node/wxYq/forgetPassword", "/node/wxChronic/forgetPassword",
//            "/api/wxChronic/wxNotify", "/api/wxChronic/wxScoreOrderNotify", "/api/wxChronic/submitPatientBaseInfo",
//            "/node/wxChronic/shareReport/**", "/api/wxChronic/queryMhAreaList/*",
//            "/api/wxChronic/queryMhAreaStreetList/*");
  }
}
