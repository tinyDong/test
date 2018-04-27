package main.concurrency.countDownLatch;

import java.util.concurrent.CountDownLatch;

//一个线程等多个线程,中途可对阻塞线程发出信号
public class latchTest {

        public long timecost(final int times, final Runnable task) throws InterruptedException {
            if (times <= 0) throw new IllegalArgumentException();
            final CountDownLatch startLatch = new CountDownLatch(1);
            final CountDownLatch overLatch = new CountDownLatch(times);
            for (int i = 0; i < times; i++) {
                new Thread(new Runnable() {
                    public void run() {
                        try {
                            System.out.println("准备");
                            startLatch.await();
                            System.out.println("开始");
                            //
                            task.run();
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        } finally {
                            overLatch.countDown();
                        }
                    }
                }).start();
            }
            //
            long start = System.nanoTime();
            Thread.sleep(1000);
            startLatch.countDown();
            overLatch.await();
            overLatch.await();
            return System.nanoTime() - start;
        }

    public static void main(String[] args) {

        try {
            new latchTest().timecost(5, new Runnable() {
                @Override
                public void run() {
                    System.out.println("开始执行任务");
                }
            });
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
