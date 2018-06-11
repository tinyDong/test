package command;

import java.util.LinkedHashMap;
import java.util.Map;

public class Receiver {
    public void action()
    {
        System.out.println("main.command received!");
    }

    public static void main(String[] args) {
        Map<String,Integer> seqMap = new LinkedHashMap<String,Integer>(16, 0.75f,false);

        seqMap.put("c", 100);
        seqMap.put("d", 200);
        seqMap.put("a", 500);
        seqMap.put("d", 300);
        seqMap.get("d");

        for(Map.Entry<String,Integer> entry : seqMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
