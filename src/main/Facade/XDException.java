package main.Facade;

public class XDException extends RuntimeException{
    private static final long serialVersionUID = 3947231994724316271L;
    /**
     * 异常ID，用于表示某一异常实例，每一个异常实例都有一个唯一的异常ID
     */
    private String id;

    /**
     * 异常码，即异常码code的后3位，由各具体异常实例化时自己定义
     */
    private String defineCode;

    /**
     * 异常信息，包含必要的上下文业务信息，用于打印日志
     */
    private String defineMsg;

    private String realClassName;

    protected XDException(String msg,String code){
        super(msg);
        this.defineMsg=msg;
        this.defineCode=code;
    }

    public void test() throws InterruptedException {
        Thread.sleep(1000);

    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDefineCode() {
        return defineCode;
    }

    public void setDefineCode(String defineCode) {
        this.defineCode = defineCode;
    }

    public String getDefineMsg() {
        return defineMsg;
    }

    public void setDefineMsg(String defineMsg) {
        this.defineMsg = defineMsg;
    }

    public String getRealClassName() {
        return realClassName;
    }

    public void setRealClassName(String realClassName) {
        this.realClassName = realClassName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("XDException{");
        sb.append("id='").append(id).append('\'');
        sb.append(", defineCode='").append(defineCode).append('\'');
        sb.append(", defineMsg='").append(defineMsg).append('\'');
        sb.append(", realClassName='").append(realClassName).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
