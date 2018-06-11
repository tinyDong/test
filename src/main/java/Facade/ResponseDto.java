package Facade;

public class ResponseDto<T> {
    public static String SUCCESS_STATUS = "SUCCESS";
    public static String FAILURE_STATUS = "FAILURE";
    String errCode;
    String errMsg;
    T data;
    String status;
    public void setSuccessStatus(){
        status = SUCCESS_STATUS;
        errCode = "";
        errMsg = "";
    }

    public void setFailureStatus(){
        status = FAILURE_STATUS;
        errCode = "";
        errMsg = "";
    }

    public Boolean isSuccess(){
       return status.equals(SUCCESS_STATUS);
    }

    public static String getSuccessStatus() {
        return SUCCESS_STATUS;
    }

    public static void setSuccessStatus(String successStatus) {
        SUCCESS_STATUS = successStatus;
    }

    public static String getFailureStatus() {
        return FAILURE_STATUS;
    }

    public static void setFailureStatus(String failureStatus) {
        FAILURE_STATUS = failureStatus;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ResponseDto{");
        sb.append("errCode='").append(errCode).append('\'');
        sb.append(", errMsg='").append(errMsg).append('\'');
        sb.append(", data=").append(data);
        sb.append(", status='").append(status).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
