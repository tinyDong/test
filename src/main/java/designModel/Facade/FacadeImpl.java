package designModel.Facade;

public class FacadeImpl implements Facade{
    @Override
    public ResponseDto<USer> queryUser() {
        return FacadeInvokeTemplate.invoke(new CallBack<USer>() {
            @Override
            public USer execute() {
                return new USer();
            }
        },"调用信息");
    }
}
