package linkedHasmap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class linkedHashmapTest {

    public void test1(){
        LinkedHashMap<String,String> testMap=new LinkedHashMap();

        testMap.put("b","1");
        testMap.put("c","1");
        testMap.put("a","1");
        testMap.put("d","1");

        Iterator iterator=testMap.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
//        for (Map.Entry<String, String> entry: testMap.entrySet()){
//            System.out.println(entry.getKey()+entry.getValue());
//        }

    }

    public static void main(String[] args) {
        new linkedHashmapTest().test1();
    }

}
