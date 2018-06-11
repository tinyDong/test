package thread.concurrency.reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class reentrantlockTest {

    private ReentrantLock lock=new ReentrantLock();
    public void test1(){
        try {
            System.out.println("test1开始等待获取锁");
            Thread.currentThread().interrupt();
            lock.lock();
            System.out.println("test1已经获取锁");

            Thread.sleep(4000);

//            lock.lock();
            System.out.println("在进入");
//            lock.unlock();
        }catch (InterruptedException e) {
                Thread.interrupted();
        } finally {
            lock.unlock();
        }
    }

    public void test2(){
        try {
            System.out.println("test2开始等待获取锁");
            lock.lock();
            System.out.println("test2开始已经获取锁");
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        final reentrantlockTest test= new reentrantlockTest();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                test.test1();
            }
        },"t1") ;
        t1.start();
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                test.test2();
            }
        },"t2");
        t2.start();

    }

}
