package proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class jdkProxy implements InvocationHandler {
    private Object target;
    public jdkProxy(Object target){
        super();
        this.target=target;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                target.getClass().getInterfaces(), this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("进入代理");
        Object result=method.invoke(target,args);
        return result;
    }

    public static void main(String[] args) {
        user user=new userImpl();
        jdkProxy proxy=new jdkProxy(user);
        user proxyUser=(user) proxy.getProxy();
        proxyUser.run();
    }
}
