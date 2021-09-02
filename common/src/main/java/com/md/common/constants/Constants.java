package com.md.common.constants;

/**
 * Created by zhangli on 16/3/2.
 */
public interface Constants {
    String DEFAULT_HOSPITAL_CODE = "default";
    String NOTHING = "0";
    String ORDER_ID ="orderId";
    // property key start
    String PROPERTY_DOMAIN_KEY = "cloud.domain";
    String CLEAN_UP_NULL_TIMES="clearNullTimes";
    String PROPERTY_SCREATE_KEY = "secret.key";

    String PROPERTY_SCREATE_PASSWORD = "secret.password";

    String PROPERTY_SMS_KEY = "sms.apikey";

    String PROPERTY_IMAGE_PATH = "image.path";

    String PROPERTY_IMAGE_URL = "image.url";

    String PROPERTY_STATIC_URL = "static.url";

    String POCT_ERROR="同步失败，请重试或手动输入检查结果";
    // property key end

    // cloud menu start
    String MENU_CURRENT_FATHER_CAI = "FatherCai";

    String MENU_CURRENT_SON_CAI = "SonCai";

    String MENU_CAI_SELECT = "-100";

    String MENU_IS_SELECTED = "1";

    String MENU_NOT_SELECTED = "0";

    Integer MENU_TYPE_CLOUD = 1;

    Integer MENU_TYPE_APP = 0;

    // cloud menu end

    // cloud login start
    String USER_LOGIN_COOKIE = "md_login";

    String USER_LOGIN_TYPE = "user_type";

    String USER_LOGIN_PASSWORD = "user_password";

    String USER_NO_AUTHORIZE = "NoAuthorize"; // 没有权限

    String USER_LOGIN_SUCCESS = "LoginSuccess"; // 登陆成功

    String USER_NOT_LOGIN = "NotLogin"; // 尚未登陆
    // cloud login end

    Integer SOURCE_TYPE_CACHE = 0;

    Integer SOURCE_TYPE_DB = 1;

    Integer SOURCE_TYPE_ALL = 2;

    String RETURN_STRING_SUCCESS = "success";

    String RETURN_STRING_ERROR = "服务器异常！";

    String RETURN_STRING_RPC_ERROR = "后台服务异常！";

    String RETURN_STRING_DATA_ERROR = "数据错误！";

    String RETURN_STRING_PARAMETE_ERROR = "请求参数错误！";

    String FLLOW_DATA_ERROR = "流程数据错误！";

    String RETURN_STRING_NOAUTH = "没有权限！";

    String RETURN_USERORPASS_ERROR = "用户名或密码错误！";

    String RETURN_NO_DATA = "没有数据！";

    String AREA_PROVINCE = "P";

    String AREA_CITY = "C";

    String AREA_DISTRICT = "D";

    String PAG_HEAD = "pag";

    String PAG_ROWS = "rows";

    String CHECK_TYPE_ZL = "ZL";

    String CHECK_TYPE_GT = "GT";

    String ITEM_CHECKED_ON = "ON";

    String ITEM_CHECKED_ALL = "ALL";

    String SMS_REGEIST = "regeist";

    String SMS_FORGETPASSWORD = "forgetpassword";

    String DIC_ALL_BASE_DATA = "DIC_ALL_BASE_DATA";

    String DIC_DEPARTMENT_CACHE = "DIC_DEPARTMENT_CACHE";

    String DIC_ALL_DEPARTMENT_CACHE = "DIC_ALL_DEPARTMENT_CACHE";

    String DIC_HOSPTIAL_CACHE = "DIC_HOSPTIAL_CACHE";

    String DIC_ALL_HOSPTIAL_CACHE = "DIC_ALL_HOSPTIAL_CACHE";

    String DIC_LABO_CACHE = "DIC_LABO_CACHE";

    String DIC_CHECK_ITEMS = "DIC_CHECK_ITEMS";

    String TOOLS_CHECK_ITEMS = "TOOLS_CHECK_ITEMS";

    String TOOLS_CHECK_ITEMS_ALL = "TOOLS_CHECK_ITEMS_ALL";

    String EMPTY = "";

    String EMPTY_K = "无";

    // 微信绑定检测单时允许的错误次数
    int WX_CHECK_BIND_ERROR_NUM = 3;
    // 状态
    int TREATMENT_STATE = 30;

    String CAR_HOSPITAL_CODE = "carHospitalCode";

    String PCI_ROOM_DATA_ERROR = "导管室已使用，请重新选择";

    // key分隔符
    String SPLIT_STR = "_";

    // 缓存hash的field,点赞状态
    String FIELD_STATUS = "status";

    // 缓存hash的field，点赞时间
    String FIELD_PRAISE_TIME = "praise_time";

    // 缓存所有用户的点赞
    String USER_PRAISES = "user_praises";

    String ERROR_MSG="班次名称不可重复";

    //主题纳排标准等于、介于
    Integer EQUAL_TO = 1;
    Integer BETWEEN = 2;
    Integer CONTAINS = 3;

    String ES_AND = "and";

    String ES_OR = "or";

    String PROVINCE = "province";

    String CITY = "city";

    String DISTRICT = "district";

    /** 系统配置 */
    String SYS_CONFIG_CACHE = "SYS_CONFIG_CACHE:";
    String SYS_ENV_NAME ="apsara.env.name";
    /** 参数键名是否唯一的返回结果码 */
    String CONFIG_KEY_UNIQUE = "0";
    String CONFIG_KEY_NOT_UNIQUE = "1";


    Integer ENABLED = 1;

    Integer NOT_ENABLED = 0;
    String DICT_KEY = "dict";

    interface Products{
         int CHEST_PAIN = 1;
         int STROKE = 2;
         int TRAUMA = 3;
         int ECG = 4;
         int DIGEST = 5;
    }

    interface TreatTypes{

        /**
         * 胸痛-直接PCI
         */
        int CP_DIRECT_PCI= 11;
        /**
         * 胸痛-溶栓
         */
        int CP_RONGSHUAN = 12;
        /**
         * 胸痛-补救PCI
         */
        int CP_REMEDIAL_PCI = 13;

        /**
         * 胸痛-溶栓后介入
         */
        int CP_INTERVE_AFTER_RONGSHUAN = 14;
        /**
         * 胸痛-择期介入
         */
        int CP_DEPENDS_INTERVE= 15;
        /**
         * 胸痛-CABG
         */
        int CP_CABG = 16;
        /**
         * 胸痛-转运PCI
         */
        int CP_TRANS_PCI = 17;
        /**
         *胸痛-紧急介入治疗
         */
        int CP_EMERG_INTERVE = 18;
        /**
         *胸痛-24H介入治疗
         */
        int CP_24H_INTERVE = 19;
        /**
         *胸痛-72H介入治疗
         */
        int CP_72H_INTERVE = 20;
        /**
         *胸痛-择期介入治疗
         */
        int CP_WAIT_INTERVE = 21;
        /**
         *胸痛-保守治疗
         */
        int CP_CONSERVATIVE = 22;
        /**
         * 胸痛-外科手术
         */
        int CP_OPERATION = 23;
        /**
         * 胸痛-其他（介入失败转为手术）
         */
        int CP_OTHER = 24;
        /**
         * 胸痛-抗凝治疗
         */
        int CP_ANTI_FREEZE = 25;

        /**
         * 卒中静脉溶栓
         */
        int CZ_RONGSHUAN = 1;
        /**
         * 卒中介入治疗
         */
        int CZ_INTERVENTION = 2;
        /**
         * 动脉瘤
         */
        int CZ_ANEURYSM = 3;
        /**
         * 脑出血
         */
        int CZ_BRAINBLEEDING = 4;
        /**
         * CEA_CAS
         */
        int CZ_CEA_CAS = 5;

        /**
         * 保守治疗
         */
        int CONSERVATIVE_TREAT = 98;

        /**
         * 创伤/消化道-抢救措施
         */
        int COMMON_FIRST_AID = 51;
        /**
         * 普通外科手术
         */
        int COMMON_OPERATION = 52;

        int MEDICAL_GIVEN = 100;
    }
    interface UserType {
        int DOCTOR = 2;
        int ADMIN = 4;
    }

    interface LisMainType{
        /**
         * poct
         */
        int POCT = 0;
        /**
         * 抽血检验
         */
        int BLOOD_TEST = 1;
        /**
         * 尿检
         */
        int PEE_TEST=2;
        /**
         * 粪检
         */
        int EXCREMENT_TEST=3;
    }

    interface  LisSubType{
        /**
         * POCT常规
         */
        int POCT = 0;
        /**
         * 血常规
         */
        int CBC = 1;
        /**
         * 凝血常规
         */
        int COAGULATION_ANALYSIS=2;
        /**
         * 肾功能
         */
        int RENAL_FUNCTION=3;
        /**
         * 尿常规
         */
        int URINALYSIS=4;
        /**
         * 粪常规
         */
        int FECAL_ROUTINE=5;
        /**
         * 心功能
         */
        int HEART_FUNCTION=6;
        /**
         * 肝功能
         */
        int LIVER_FUNCTION=7;
        /**
         * 电解质
         */
        int ELECTROLYTE=8;
        /**
         * 乙丙肝
         */
        int HEPATITIS=9;
        /**
         * HIV
         */
        int HIV=10;
        /**
         * 梅毒
         */
        int SYPHILIS=11;
    }

    interface PacsType {
        int CT = 1;
        int MRI = 2;
        /**
         * 电子胃镜
         */
        int EGD = 3;
        int DR = 4;
    }

    /**
     * CT部位
     */
    interface CtPart {
        /**
         * 脑部
         */
        int BRAIN = 1;
        /**
         * 胸部
         */
        int CHEST = 2;
        /**
         * 盆骨
         */
        int PELVIS =3;
        /**
         * 腹部
         */
        int FUBU = 4;
        /**
         * 血管
         */
        int BLOOD = 5;
        /**
         * 上肢
         */
        int SHANG_ZHI = 6;
        /**
         * 下肢
         */
        int XIA_ZHI = 7;
        /**
         * 脊柱
         */
        int JIZHU =8;
    }

    /**
     * 性别
     */
    interface Sex {
        int MALE = 1;
        int FEMALE = 2;
        int UNKNOWN = 3;
    }

    /**
     * 再次危险分层类型
     */
    interface RiskReconsideration{
        int STEMI = 1;
        int EXTREME_DANGER = 2;
        int HIGHLY_DANGER = 3;
        int MEDIUM_DANGER = 4;
        int LOW_DANGER = 5;
        int NOT_DONE = 98;
        int UNCHOOSED = 0;
    }

    /**
     * 诊断类型
     */
    interface DiagnosisType{
        //STEMI
        int diagnosisType_1= 1;
        //NSTEMI
        int diagnosisType_2= 2;
        //UA
        int diagnosisType_3= 3;
        //主动脉夹层
        int diagnosisType_4= 4;
        //肺动脉栓塞
        int diagnosisType_5= 5;
        //张力性气胸
        int diagnosisType_6= 6;
        //非ACS心源性胸痛
        int diagnosisType_7= 7;
        //其他非心源性胸痛
        int diagnosisType_8= 8;
        //待查
        int diagnosisType_9= 9;
    }

    /**
     *来源方式
     * 1.院前诊断 10.院内诊断
     */
    interface LocationType{
        int LOCATION_YQ = 1;
        int LOCATION_YN = 10;
    }

    /**
     * 客户端类型 1APP，2PC
     */
    interface ClientType{
        int APP = 1;
        int PC = 2;
    }

    /**
     * 胸痛诊断结果
     */
    interface CpcDiagnosis{
        int STEMI = 1;
        int NSTEMI = 2;
        int UA = 3;
    }
    /**
     * 卒中诊断结果
     */
    interface StrokeDiagnosis{
        int NGS = 20;//脑梗死
        int NCX = 21;//脑出血
        int DML = 22;//动脉瘤
    }
    //0.默认 1.首诊 2.溶栓前 3.溶栓0.5H 4.溶栓结束后立刻 5.术前 6.溶栓后24H 7.7正负2天 8.血管内治疗后 9.血管内治疗后24H 10.出院 11院前 12.血管内治疗正负2天 99.其他
    interface AnswerType{
        int DEFAULT =0;
        int FIRST_DIAG =1;
        int BEFORE_RONGSHUAN=2;
        int AFTER_RONGSHUAN_30MIN=3;
        int AFTER_RONGSHUAN = 4;
        int BEFORE_OPERATION = 5;
        int AFTER_RONGHSUAN_24H=6;
        int RONGSHUAN_2DAYS=7;
        int AFTER_XGN=8;
        int AFTER_XGN_24H=9;
        int LEAVE_HOSPITAL=10;
        int BEFORE_HOSPITAL=11;
        int XGN_2DAYS=12;
        int OTHER=99;
    }
    //卒中生命体征类型：0:病情初判，1：溶栓记录，2：手术记录，3：治疗后24h，15：溶栓开始每15分钟，60：溶栓结束后每1小时
    interface StrokeVitalType{
        int ASSESSMENT = 0;
        int RONGSHUAN = 1;
        int OPERATION = 2;
        int AFTER_24H = 3;
        int RONGSHUAN_15 = 15;
        int RONGSHUAN_60 = 60;
    }

    //消化道诊断类型，40上消化道出血，41下消化道出血
    interface DigestDiagnosis{
        int DIAGNOSIS_40 = 40;
        int DIAGNOSIS_41 = 41;
    }
}
