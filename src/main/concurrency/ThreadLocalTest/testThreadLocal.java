package main.concurrency.ThreadLocalTest;

import java.util.concurrent.atomic.AtomicInteger;

public class testThreadLocal {
    private ThreadLocal<Object> tl = new ThreadLocal<Object>();

    private String name;

    public void set(Object str, String name){
        tl.set(str);
        this.name = name;
        //System.out.println(Thread.currentThread().getName()+":"+str);
    }

    public Object get(){
        return tl.get();
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        final testThreadLocal tlt = new testThreadLocal();
        new Thread(new Runnable() {
            public void run() {
                tlt.set(tlt,"work");
                System.out.println(tlt.get());
                System.out.println(tlt.getName());
            }
        }).start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(new Runnable() {

            public void run() {
                tlt.set(tlt,"work");
                System.out.println(tlt.get());
                System.out.println(tlt.getName());
            }
        }).start();

    }
}

