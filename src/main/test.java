package main;


import main.reflect.User;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.LongAdder;

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
