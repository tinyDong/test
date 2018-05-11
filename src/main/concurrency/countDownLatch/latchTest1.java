package main.concurrency.countDownLatch;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class latchTest1 {
//	private CountDownLatch countDownLatch =new CountDownLatch(1);
	private CyclicBarrier cyclicBarrier=new CyclicBarrier(3);
	public void test(){
		try {
			System.out.println("开始countDown");
			Thread.sleep(200);
//			countDownLatch.countDown();
			try {
				cyclicBarrier.await();
			} catch (BrokenBarrierException e) {
				e.printStackTrace();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void awaitTest(){
		try {
			System.out.println("start await");
			try {
				cyclicBarrier.await();
			} catch (BrokenBarrierException e) {
				e.printStackTrace();
			}
//			countDownLatch.await();
			System.out.println("end await");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		latchTest1 l1=new latchTest1();

		new Thread(new Runnable() {
			@Override
			public void run() {
				l1.awaitTest();
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				l1.awaitTest();
			}
		}).start();

		try {
			l1.cyclicBarrier.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}


//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		System.out.println("继续");
	}
}
