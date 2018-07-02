package promptOptimize;

public class RuleDto {
    private String ruleCode;
    private String ruleCodeType;
    private Integer ruleCodeLevel =0;
    private String ruleCodeSubclass;
    private Integer ruleCodeSubclassLevel=0;
    private String ruleContent;

    public String getRuleContent() {
        return ruleContent;
    }

    public void setRuleContent(String ruleContent) {
        this.ruleContent = ruleContent;
    }

    public String getRuleCode() {
        return ruleCode;
    }

    public void setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
    }

    public String getRuleCodeType() {
        return ruleCodeType;
    }

    public void setRuleCodeType(String ruleCodeType) {
        this.ruleCodeType = ruleCodeType;
    }

    public String getRuleCodeSubclass() {
        return ruleCodeSubclass;
    }

    public void setRuleCodeSubclass(String ruleCodeSubclass) {
        this.ruleCodeSubclass = ruleCodeSubclass;
    }

    public Integer getRuleCodeSubclassLevel() {
        return ruleCodeSubclassLevel;
    }

    public void setRuleCodeSubclassLevel(Integer ruleCodeSubclassLevel) {
        this.ruleCodeSubclassLevel = ruleCodeSubclassLevel;
    }

    public Integer getRuleCodeLevel() {
        return ruleCodeLevel;
    }

    public void setRuleCodeLevel(Integer ruleCodeLevel) {
        this.ruleCodeLevel = ruleCodeLevel;
    }

    @Override
    public String toString() {
        return "RuleDto{" +
                "ruleCode='" + ruleCode + '\'' +
                ", ruleCodeType='" + ruleCodeType + '\'' +
                ", ruleCodeLevel='" + ruleCodeLevel + '\'' +
                ", ruleCodeSubclass='" + ruleCodeSubclass + '\'' +
                ", ruleCodeSubclassLevel='" + ruleCodeSubclassLevel + '\'' +
                ", ruleContent='" + ruleContent + '\'' +
                '}';
    }
}
