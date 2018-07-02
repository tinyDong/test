package promptOptimize;

public enum DriverCardStatusEnum {

	A("A", "正常"),
	B("B", "超分"),
	C("C", "转出"),
	D("D", "暂扣"),
	E("E", "撤销"),
	F("F", "吊销"),
	G("G", "注销"),
	H("H", "违法未处理"),
	I("I", "事故未处理"),
	J("J", "停止使用"),
	K("K", "协查"),
	L("L", "锁定"),
	M("M", "逾期未换证"),
	N("N", "延期换证"),
	P("P", "延期体检"),
	R("R", "逾期未体检"),
	S("S", "逾期未审"),
	U("U", "扣留"),
	Z("Z", "其他"),
	N1("-1", "驾驶证查询失败");

	private String value;
	private String name;

	private DriverCardStatusEnum(String value, String name) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return this.name;
	}

	public String getValue() {
		return this.value;
	}

	public static String getName(String value) {
		for (DriverCardStatusEnum annexEnum : DriverCardStatusEnum.values()) {
			if (annexEnum.getValue().equals(value)) {
				return annexEnum.getName();
			}
		}
		return "未定义的返回码";
	}
}
