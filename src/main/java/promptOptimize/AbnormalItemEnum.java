package promptOptimize;

public enum AbnormalItemEnum {

	ITEM_1(1, "申请人同盾"),
	ITEM_2(2, "申请人国政通身份证"),
	ITEM_3(3, "申请人国政通学历"),
	ITEM_4(4, "申请人银联智慧借记卡"),
	ITEM_5(5, "申请人银联智慧信用卡"),
	ITEM_6(6, "前海征信"),
	ITEM_7(7, "GEO"),
	ITEM_8(8, "申请人国政不良"),
	ITEM_9(9, "配偶国政通不良"),
	ITEM_10(10, "担保人国政通不良"),
	ITEM_11(11, "申请人银联画像借记卡"),
	ITEM_12(12, "申请人银联画像信用卡"),
	ITEM_13(13, "申请人百融特殊名单"),
	ITEM_14(14, "申请人蜜罐"),
	ITEM_16(16, "配偶蜜罐"),
	ITEM_17(17, "配偶同盾"),
	ITEM_18(18, "配偶百融特殊名单"),
	ITEM_19(19, "配偶国政通身份证"),
	ITEM_20(20, "担保人蜜罐"),
	ITEM_21(21, "担保人同盾"),
	ITEM_22(22, "担保人百融特殊名单"),
	ITEM_23(23, "担保人国政通身份证"),
	ITEM_28(28, "申请人芝麻信用"),
	ITEM_29(29, "申请人芝麻行业关注名单"),
	ITEM_30(30, "申请人芝麻信用信息验证"),
	ITEM_31(31, "申请人芝麻信用雨分"),
	ITEM_32(32, "申请人凭安"),
	ITEM_33(33, "紧急联系人凭安"),
	ITEM_34(34, "第二联系人凭安"),
	ITEM_35(35, "聚信立运营商报告"),
	ITEM_36(36, "聚信立淘宝报告"),
	ITEM_37(37, "聚信立京东报告");

	private Integer value;
	private String name;

	private AbnormalItemEnum(Integer value, String name) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return this.name;
	}

	public Integer getValue() {
		return this.value;
	}

	public static String getName(Integer value) {
		for (AbnormalItemEnum annexEnum : AbnormalItemEnum.values()) {
			if (annexEnum.getValue() == value) {
				return annexEnum.getName();
			}
		}
		return "未定义的返回码";
	}
}
