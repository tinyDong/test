package thread;



public class WaitAndNotify {

    private final Object object = new Object();

    public void awaitTest(){
        synchronized (object){
            System.out.println("进入锁");
            try {
                object.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("awaitTest 推出锁");
        }
    }

    public void notifyTest(){
        synchronized (object){
            System.out.println("notifyTest 进入锁");
            object.notify();
            System.out.println("notifyTest 释放了");
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {

        WaitAndNotify test = new WaitAndNotify();
        new Thread(new Runnable() {
            @Override
            public void run() {
                test.awaitTest();
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                test.notifyTest();
            }
        }).start();

    }
}
