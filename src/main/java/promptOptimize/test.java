package promptOptimize;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;

import java.util.*;

public class test {
    private static String[] names = { "命中同盾黑名单详情：", "命中百融黑名单详情：", "绿湾驾驶证状态：", "前海好信度评分：", "国政通学历查询结果：" };
    private static String[] keys = { "tdBlacklistDetail", "brBlacklistDetail", "lwDriverStatus", "qhCredooScore",
            "xlDataStatusValue" };

    final static private String POLICY_TIPS_KEY="政策提示";

    final static private String FRAUD_TIPS_KEY="反欺诈提示";
    public static void main(String[] args) {

        String str="{\"abnormalItem\":\"[0, 0, 2, 2, 2, 2, 2, 2, 2, 2]\",\"appCode\":\"F1806261900700580002\",\"beforeResult\":\"RETURN\",\"blacklistRcode\":\"[]\",\"brBlacklistDetail\":\"[]\",\"createTime\":1529992121568,\"creditWorkflow\":\"L\",\"decisionEngineOnlineInfo\":{\"contractNo\":\"F1806261900700580002\",\"createTime\":1529992121562,\"creator\":\"sys\",\"deployer\":\"杨金\",\"id\":6334,\"modifier\":\"sys\",\"modifyTime\":1529992121562,\"serName\":\"MLJRLY\",\"stragetyVersion\":\"MLJRLY:2018.v1.10.13\",\"stragetyVersionDate\":\"MLJRLY:2018-06-06\",\"tester\":\"朱昆、蒋洁、李润、朱昆、马雪曼、米伟民\"},\"decisionMidVariable\":[\"Missing\",\"Missing\",\"0-31\",\"Missing\",\"父母与亲属\",\"00\",\"Missing\",\"5\",\"Missing\",\"low-<29\",\"私营企业等行业\",\"评分卡模型\",\"\",\"\",\"0,0,0,0,121,106,76,76,74,67,61,30,30,30,30,\",\"213\",\"99\",\"01\",\"I;;;Initial;0;;;\",\"C;;中间变量.评分卡模型.其他搜索次数:other_search_count;Missing;106;106;-1;\",\"C;;中间变量.评分卡模型.\uFEFF间接联系人在黑名单数量:mg_secondContact_bl;Missing;74;74;-1;\",\"C;;中间变量.评分卡模型.申请人年龄:age;0-31;61;61;28;\",\"C;;中间变量.评分卡模型.\uFEFF配偶年龄:spouse_age;Missing;30;30;-1;\",\"C;;中间变量.评分卡模型.与紧急联系人关系:RELATION_E_CONTACT1;父母与亲属;67;67;01;\",\"C;;中间变量.评分卡模型.性别和婚姻:sex_marriage;00;76;76;00;\",\"C;;中间变量.评分卡模型.近6个月身份证百融非银合作申请机构数:al_m6_id_notbank_orgnum1;Missing;76;76;-1;\",\"C;;中间变量.评分卡模型.教育与国政通状况_新:education_degree3;5;30;30;01;\",\"C;;中间变量.评分卡模型.3个月内申请人在多个平台借款数:COL73;Missing;121;121;-1;\",\"C;;中间变量.评分卡模型.首付占整体金额占比:A_init_initloan_SCALE;low-<29;30;30;27.5356;\",\"C;;中间变量.评分卡模型.\uFEFF现工作单位性质:NOW_UNIT_KIND;私营企业等行业;30;30;02;\",\"T;;;Transformed;701;;701;\",\"\",\"\",\"\",\"\",\"Y\",\"Y\",\"Y\",\"\",\"\",\"Y\",\"亲属\",\"亲属\",\"C\",\"L\",\"Y\",\"Y\",\"Y\",\"Y\",\"Y\",\"Y\",\"\",\"\",\"\",\"L\",\"L\",\"L\",\"Y_1\",\"D\",\"Y_2\",\"D\",\"\",\"\",\"\",\"D\",\"Y_3\",\"Y_3\",\"Y_2\",\"Y_4\",\"Y_2\",\"Y_2\",\"H\",\"H\",\"L\",\"H\",\"L\",\"L\",\"UCZY-010\",\"\",\"0\",\"-9999\",\"L\",\"L\",\"L\",\"L\",\"L1\",\"L1U2\",\"\",\"\",\"\",\"99\",\"99\",\"99\",\"\",\"99\",\"\",\"30\",\"30\",\"2\",\"0\"],\"externalRcode\":\"[]\",\"flowCode\":\"END\",\"flowUserType\":\"[Y, N, N, N, N, N, N, N, N, N]\",\"fraudAlert\":\"H\",\"fraudAlertNew\":\"C\",\"fraudScore\":130,\"fundRcode\":\"[]\",\"gtGztBadInfoDetail\":\"[]\",\"gztBadInfoDetail\":\"[]\",\"id\":30641,\"insRuleACodeList\":[],\"insRuleBCode\":\"[AW065:风险经销商--查维保, AW212:查博士可查维保品牌--手工查维保A2, BA019:一车多卖嫌疑, BA028:一车多卖，且里程不同, DBC45:短时间内同一单位名称申请次数过多, EB236:主贷人与历史主贷人单位名称重复, EB251:主贷人与历史担保人单位名称重复, EB267:主贷人与历史主贷人单位地址重复, EBC11:单位名称与近期主贷人单位名称重复1, EBC24:单位名称与近期主贷人单位名称重复2, EBC33:单位名称与近期主贷人单位名称重复3]\",\"insRuleBCodeLevel\":\"[AW065:6, BA019:176, DBC45:8, EB236:4, EB251:10, EB267:11, EBC11:5, EBC24:6, EBC33:7]\",\"insRuleBCodeList\":[\"AW065:风险经销商--查维保\",\"AW212:查博士可查维保品牌--手工查维保A2\",\"BA019:一车多卖嫌疑\",\"BA028:一车多卖，且里程不同\",\"DBC45:短时间内同一单位名称申请次数过多\",\"EB236:主贷人与历史主贷人单位名称重复\",\"EB251:主贷人与历史担保人单位名称重复\",\"EB267:主贷人与历史主贷人单位地址重复\",\"EBC11:单位名称与近期主贷人单位名称重复1\",\"EBC24:单位名称与近期主贷人单位名称重复2\",\"EBC33:单位名称与近期主贷人单位名称重复3\"],\"insRuleBCodeSubclass\":\"[AW065:政策类提示, BA019:个人风险, DBC45:雇佣关系, EB236:雇佣关系, EB251:雇佣关系, EB267:雇佣关系, EBC11:雇佣关系, EBC24:雇佣关系, EBC33:雇佣关系]\",\"insRuleBCodeSubclassLevel\":\"[AW065:2, BA019:3, DBC45:2, EB236:2, EB251:2, EB267:2, EBC11:2, EBC24:2, EBC33:2]\",\"insRuleBCodeType\":\"[AW065:政策提示, BA019:反欺诈提示, DBC45:反欺诈提示, EB236:反欺诈提示, EB251:反欺诈提示, EB267:反欺诈提示, EBC11:反欺诈提示, EBC24:反欺诈提示, EBC33:反欺诈提示]\",\"isKoTestFlag\":\"N\",\"listAbnormalItem\":[\"同盾查询状态查询成功但无返回值\",\"国政通身份证查询状态查询成功但无返回值\",\"国政通学历查询状态没有去查该外部数据\",\"银联智慧借记卡查询状态没有去查该外部数据\",\"银联智慧信用卡查询状态没有去查该外部数据\",\"前海查询状态没有去查该外部数据\",\"GEO查询状态没有去查该外部数据\",\"国政通不良查询状态没有去查该外部数据\",\"人行数据查询状态没有去查该外部数据\",\"人行数据状态码没有去查该外部数据\",\"银联借记卡查询状态\",\"银联贷记卡查询状态\",\"百融查询状态\",\"蜜罐查询状态\",\"暂无对应关系\",\"配偶蜜罐查询状态\",\"配偶同盾查询状态\",\"配偶百融查询状态\",\"配偶国政通身份证查询状态\",\"担保人蜜罐查询状态\",\"担保人同盾查询状态\",\"担保人百融查询状态\",\"担保人国政通身份证查询状态\",\"暂无对应关系\",\"暂无对应关系\",\"暂无对应关系\",\"暂无对应关系\",\"芝麻信用评分查询状态\",\"芝麻信用行业关注名单查询状态\",\"芝麻信用信息验证查询状态\",\"芝麻信用雨分查询状态\",\"凭安查询状态\",\"紧急联系人凭安查询状态\",\"第二联系人凭安查询状态\",\"聚信立运营商查询状态\",\"聚信立淘宝查询状态\",\"聚信立京东查询状态\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\"],\"mergeRcode\":\"[BG02, NT02_L1]\",\"mtGztBadInfoDetail\":\"[]\",\"preRate\":\"TEST\",\"qhCredooScore\":-1,\"qianhaiRcode\":\"[]\",\"refuseRcode\":\"BG02\",\"retCode\":\"BG02\",\"retMsg\":\"规则引擎外部征信未通过\",\"returnCode\":\"A\",\"riskGrade\":\"中风险3\",\"riskLabel\":\"中风险\",\"riskWorkflow\":\"J\",\"ruleCode\":\"[BG02, RTZ01_1, RTZ01_6, RTZ01_9]\",\"score\":\"701\",\"serialNo\":\"2018062613482715910\",\"stragCatg\":\"OLD_ZY-NEW\",\"stragIdFlag\":\",is_fraud:N,new_credit_overdue_0/1:Y,new_loan_num:0,new_credit_num:0,new_credit_limit:-9999,new_loan_6m_overdue:N,new_credit_age_6m:N,new_loan_age_6m:N,age:28,jxl_online_time:-358492,mx_online_time:0,YJ-A:,YJ-S:,YJ-G:,RP09.over_sum:0,RP09.loan_status:N,RP11.overdue_sum:0,TP01.loan_overdue>0:Y,TP03.24m_123:,TP03.24m_123_num:0,TP04.12m_123:,TP04.12m_orderdue_123:0,TP05.12m_123:,TP05.12m_orderdue_123:0,TP07.24m_num:,TP08.12m_num:0,TP09.12m_num:0,TP10.6m_3+num:0,TP11.6m_2_num:0,TP12.credit_overdue>0:Y,TP13.2m_appro_time:0,TP14.cre/loan_null :Y,TP14.other_loan:Y,TP14.appro_time:0,TP15.24m_4+:N,TP16.12m_4:,TP16.12m_4_num:,TP17.12m_2:,TP17.12m_2_num:0,TP18.12m_1:,TP18.12m_1_num:0,TP19.6m_3:,TP19.6m_3_num:0,TP20.6m_2:,TP20.6m_2_num:0,TP21.6m_1:,TP21.6m_1_num:0,TP22.loan_overdue_≥1000:,TP23.cre_24m_4+:N,TP24.cre_12m_4:,TP25.cre_12m_3:0,TP26.cre_12m_2:,TP27.cre_12m_1:,TP28.cre_6m_3:,TP29.cre_6m_1:,TP30.cre_overdue_≥1000:,cre_sum_overdue:0,loan_sum_overdue:0,适用车类:UC,适用利率.11.99,12.99,13.99:N,经销商类型:SP,适用渠道:ZY,是否NC高风险经销商:N,车型组合判断:UCZY,车型组合判断-新车:,KO_D:,is_RP:Y,KO_H:,KO_L:,S_1N1_7,S_1N2_6,S_1,new_pre_workflow:J,new_final_workflow:L,desicion5_workflow:L,desicion6_workflow:L,desicion7_workflow:L,desicion8_workflow:L,desicion10_workflow:L1,desicion11_workflow:L1U2\",\"stragetyversion\":\"MLJRLY:2018.v1.10.13\",\"stragetyversionDate\":\"MLJRLY:2018-06-06\",\"tdBlacklistDetail\":\"[]\",\"testCode\":\"[]\",\"thirdCreditResultDTO\":{\"baiduBlackListResultDTO\":{\"blackLevel\":\"-9999\",\"blackReason\":\"-9999\"},\"brCreditDataResultDTO\":{},\"brCreditDataResultGtDTO\":{},\"brCreditDataResultMtDTO\":{},\"zhGeoResultDTO\":{\"geoResultDTO\":{}},\"zhIdentityResultDTO\":{\"dataResource\":\"GZT\"}},\"treeGroup\":\"O\",\"versionCode\":\"MLJRLY20180010_v13\",\"workflowCode\":\"[]\",\"workflowCodeH\":\"[]\",\"workflowLabel\":\"一般用户\",\"workflowQueue\":\"B\",\"xlDataStatusValue\":\"未查询到数据\",\"zhengxinAbnormal\":\"Y\"}";
        new test().processTips(str);

    }


    private void processTips(String str) {
        JSONObject contentMap = JSON.parseObject(str);
        String insRuleBCodeType=contentMap.getString("insRuleBCodeType");
        String insRuleBCodeSubclass=contentMap.getString("insRuleBCodeSubclass");

        String insRuleBCodeSubclassLevel=contentMap.getString("insRuleBCodeSubclassLevel");
        String insRuleBCodeLevel=contentMap.getString("insRuleBCodeLevel");
        String insRuleBCode=contentMap.getString("insRuleBCode");
        LinkedHashMap<String,String> insRuleBCodeMap=turnToMap(insRuleBCode);
        LinkedHashMap<String,String> insRuleBCodeTypeMap=turnToMap(insRuleBCodeType);
        LinkedHashMap<String,String> insRuleBCodeSubclassMap =turnToMap(insRuleBCodeSubclass);
        LinkedHashMap<String,String> insRuleBCodeSubclassLevelMap=turnToMap(insRuleBCodeSubclassLevel);
        LinkedHashMap<String,String> insRuleBCodeLevelMap =turnToMap(insRuleBCodeLevel);

        List<RuleDto> ruleDtos= assembleObject(insRuleBCodeTypeMap,insRuleBCodeSubclassMap,insRuleBCodeSubclassLevelMap,insRuleBCodeLevelMap,insRuleBCodeMap);

        Set<String> codeTypeSet =getRuleCodeClassSet(ruleDtos);
        Map<String,Set<String>> subTypeClassMap=getRuleSubClassSet(ruleDtos,codeTypeSet);
        Map<String,Object> separateMap=separateRuleDtosByType(ruleDtos,codeTypeSet);
        Map<String,Object> separateSubMap=separateSubRuleDtosByType(ruleDtos,separateMap,subTypeClassMap);
        System.out.println(getFraudTipsString(separateSubMap));
        System.out.println("================");
        System.out.println(getPolicyTipsString(separateSubMap));
    }

    private Map<String,Set<String>> getRuleSubClassSet(List<RuleDto> ruleDtos, Set<String> codeTypeSet) {
        LinkedHashMap<String,Set<String>> setMap=new LinkedHashMap<>();
        for (String str:codeTypeSet){
            Set<String> set= new LinkedHashSet<>();
            for (RuleDto dto:ruleDtos){
                if ( dto.getRuleCodeType().equals(str)&&dto.getRuleCodeSubclass()!=null){
                    set.add(dto.getRuleCodeSubclass());
                }
            }
            setMap.put(str,set);
        }

        return setMap;
    }


    private Set<String> getRuleCodeClassSet(List<RuleDto> ruleDtos) {
        Set<String> set= new LinkedHashSet<>();
        for (RuleDto dto:ruleDtos){
            if (dto.getRuleCodeType()!=null){
                set.add(dto.getRuleCodeType());
            }
        }
        return set;
    }

    private static String getFraudTipsString(Map<String, Object> separateSubMap) {
        StringBuilder sb = null;
        if (separateSubMap.containsKey(FRAUD_TIPS_KEY)){
            sb=new StringBuilder();
            HashMap<String,Map> map =(HashMap)separateSubMap.get(FRAUD_TIPS_KEY);
            for (Map.Entry entry:map.entrySet()){
                ArrayList<RuleDto> arrayList=(ArrayList<RuleDto>) entry.getValue();
                sb.append("\n");
                sb.append(entry.getKey());
                sb.append("\n");
                for (RuleDto dto:arrayList){
                    if (StringUtils.isNotEmpty(dto.getRuleCode())&&StringUtils.isNotEmpty(dto.getRuleContent())){
                        sb.append(dto.getRuleCode()).append(":").append(dto.getRuleContent());
                    }
                }
            }
        }
        return sb==null?null:sb.toString();

    }

    private static String getPolicyTipsString(Map<String,Object> separateSubMap) {
        StringBuilder sb = null;
        if (separateSubMap.containsKey(POLICY_TIPS_KEY)){
            sb=new StringBuilder();
            ArrayList<RuleDto> ruleDtos=(ArrayList<RuleDto>) separateSubMap.get(POLICY_TIPS_KEY);
            for (RuleDto dto:ruleDtos){
                if (StringUtils.isNotEmpty(dto.getRuleCode())&&StringUtils.isNotEmpty(dto.getRuleContent())){
                    sb.append(dto.getRuleCode()).append(":").append(dto.getRuleContent());
                }
            }
        }
        return sb==null?null:sb.toString();
    }

    private Map<String,Object> separateSubRuleDtosByType(List<RuleDto> ruleDtos, Map<String, Object> separateMap, Map<String,Set<String>> subCodeTypeMap) {
        for (Map.Entry<String,Set<String>> entry:subCodeTypeMap.entrySet()){
            if (separateMap.containsKey(entry.getKey())){
                Set<String> subClassType=entry.getValue();
                Map<String,List> subTypeMap=new LinkedHashMap<>();
                for (String subType:subClassType){
                    ArrayList<RuleDto> list=new ArrayList<>();
                    for (RuleDto dto:ruleDtos){
                        if (StringUtils.isNotEmpty(dto.getRuleCodeSubclass())&&dto.getRuleCodeSubclass().equals(subType)) {
                            list.add(dto);
                        }
                    }
                    list.sort(Comparator.comparing(RuleDto::getRuleCodeLevel));
                    subTypeMap.put(subType,list);
                }
                separateMap.put(entry.getKey(),subTypeMap);
            }

        }

//        Map<String,List> subTypeMap=new LinkedHashMap<>();
//        for (String subType:subCodeTypeSet){
//            ArrayList<RuleDto> list=new ArrayList<>();
//            for (RuleDto dto:ruleDtos){
//                if (StringUtils.isNotEmpty(dto.getRuleCodeSubclass())&&dto.getRuleCodeSubclass().equals(subType)) {
//                    list.add(dto);
//                }
//            }
//            list.sort(Comparator.comparing(RuleDto::getRuleCodeLevel));
//            subTypeMap.put(subType,list);
//        }
//        for (Map.Entry<String,Object> entry:separateMap.entrySet()){
//            if (entry.getKey().contains(POLICY_TIPS_KEY)){
//                continue;
//            }
//            separateMap.put(entry.getKey(),subTypeMap);
//
//        }
        return separateMap;
    }

    private Map<String,Object> separateRuleDtosByType(List<RuleDto> ruleDtos, Set<String> codeTypeSet) {
        Map<String,Object> typeMap=new LinkedHashMap<>();
        for (String type:codeTypeSet){
            List<RuleDto> subTypeList=new ArrayList<>();
            for (RuleDto dto:ruleDtos){
                if (dto.getRuleCodeType()!=null&&dto.getRuleCodeType().equals(type)){
                    subTypeList.add(dto);
                }
            }
            typeMap.put(type,subTypeList);
        }
        return typeMap;
    }

    private List<RuleDto> assembleObject(Map<String,String> insRuleBCodeTypeMap, Map<String,String> insRuleBCodeSubclassMap,
                                         Map<String,String> insRuleBCodeSubclassLevelMap, Map<String,String> insRuleBCodeLevelMap,Map<String,String> insRuleBCodeMap) {
        ArrayList<RuleDto> list =new ArrayList<>(insRuleBCodeMap.size());
        for (Map.Entry<String,String> entry:insRuleBCodeMap.entrySet()){
            String key = entry.getKey();
            RuleDto dto=new RuleDto();
            dto.setRuleContent(entry.getValue());
            dto.setRuleCode(entry.getKey());

            if (insRuleBCodeLevelMap.containsKey(key)){
                dto.setRuleCodeLevel(Integer.valueOf(Optional.ofNullable(insRuleBCodeLevelMap.get(key)).orElse("0")));
            }

            if (insRuleBCodeSubclassMap.containsKey(key)){
                dto.setRuleCodeSubclass(insRuleBCodeSubclassMap.get(key));
            }

            if (insRuleBCodeSubclassLevelMap.containsKey(key)){
                dto.setRuleCodeSubclassLevel(Integer.valueOf(Optional.ofNullable(insRuleBCodeSubclassLevelMap.get(key)).orElse("0")));
            }
            if (insRuleBCodeTypeMap.containsKey(key)){
                dto.setRuleCodeType(insRuleBCodeTypeMap.get(key));
            }
            list.add(dto);
        }
        list.sort(Comparator.comparing(RuleDto::getRuleCodeSubclassLevel));
        return list;
    }



    private LinkedHashMap<String,String> turnToMap(String insRuleBCodeType) {
        LinkedHashMap<String,String> insRuleBCodeTypeMap= new LinkedHashMap<>();
        if (StringUtils.isBlank(insRuleBCodeType)){
            return insRuleBCodeTypeMap;
        }
        insRuleBCodeType=insRuleBCodeType.replace("[","").replace("]","");
        String[] strings=insRuleBCodeType.split(",");
        for (String item:strings){
            if (!item.contains(":")){
                continue;
            }
            String[] itemStr=item.split(":");
            if (itemStr.length<2){
                insRuleBCodeTypeMap.put(itemStr[0],null);
            }else {
                //编码在前
                insRuleBCodeTypeMap.put(itemStr[0],itemStr[1]);
            }

        }
        return insRuleBCodeTypeMap;
    }


}
