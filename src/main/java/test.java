import reflect.User;

import java.util.LinkedHashMap;


public class test extends User {
    private String ss;

    public String getSs() {
        return ss;
    }

    public void setSs(String ss) {
        this.ss = ss;
    }

    public static void test(){
        LinkedHashMap map=new LinkedHashMap();
        map.put(1,"a");
        map.put(2,"b");
        map.put(1,"c");
        System.out.println(map.values());
    }


    public static void main(String[] args) {

        test();

    }
}
