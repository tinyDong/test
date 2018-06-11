package designModel.reflect;


import java.lang.reflect.Method;
import java.util.TreeSet;

public class ReflectCase {

    public static void main(String[] args) throws Exception {
        Proxy target = new Proxy();
        Method method = Proxy.class.getDeclaredMethod("run");
        Object ss=method.invoke(target);
        System.out.println(ss);
        TreeSet set=new TreeSet();
        System.out.println(set);
    }

    static class Proxy {
        public User run() {
            System.out.println("run");
            User user=new User();
            user.setAge(11);
            user.setName("张三");
            return user;
        }
    }
}
