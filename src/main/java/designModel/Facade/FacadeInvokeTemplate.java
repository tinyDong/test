package designModel.Facade;


import designModel.Facade.Exception.XDException;

public class FacadeInvokeTemplate<T> {
    public static <T> ResponseDto<T> invoke(CallBack<T> callBack,String executeInfo){
        ResponseDto<T> response = new ResponseDto<T>();
        Long startTime = System.currentTimeMillis();
        try {
            T data=callBack.execute();
            response.setData(data);
            response.setErrCode("");
            response.setErrMsg("");
            response.setSuccessStatus();
            System.out.println("success"+executeInfo+startTime.toString());
        }catch (XDException e){
            response.setErrCode("");
            response.setErrMsg(e.getDefineMsg());
            response.setFailureStatus();
            System.out.println("failure"+executeInfo+startTime.toString());
        }

        return response;
    }
}
