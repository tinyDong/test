package promptOptimize;

public enum AbnormalItemStatusEnum {

	STATUS_01(-1, "查询异常"),
	STATUS_0(0, "查询成功但返回空白结果"),
	STATUS_1(1, "查询成功"),
	STATUS_2(2, "默认值，表示未去查询"),
	STATUS_9(9, "此位置未对应外部数据"), ;

	private Integer value;
	private String name;

	private AbnormalItemStatusEnum(Integer value, String name) {
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
		for (AbnormalItemStatusEnum annexEnum : AbnormalItemStatusEnum.values()) {
			if (annexEnum.getValue() == value) {
				return annexEnum.getName();
			}
		}
		return "未定义的返回码";
	}
}
