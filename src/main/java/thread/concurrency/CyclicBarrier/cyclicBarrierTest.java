package thread.concurrency.CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class cyclicBarrierTest {
    static final CyclicBarrier barrier=new CyclicBarrier(3);

   //多个线程等多个线程,只有都到阻塞位置 才可以继续
    static class test implements Runnable{

        @Override
        public void run() {
            try {
                System.out.println("进入线程"+Thread.currentThread().getId()+"开始执行任务");
                Thread.sleep(3000);
                System.out.println("线程"+Thread.currentThread().getId()+"进入等待");
                barrier.await();

            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("线程"+Thread.currentThread().getId()+"开始执行");
        }
    }

    public static void main(String[] args) {

        ExecutorService executor= Executors.newFixedThreadPool(3);
        executor.submit(new test());
        executor.submit(new test());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executor.submit(new test());
    }
}
