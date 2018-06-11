package designModel.productAndConsumer;

import java.util.concurrent.LinkedBlockingQueue;

public class consumerTest {
	LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();

	public Boolean addTask(Runnable runnable){
		linkedBlockingQueue.offer(runnable);
		return false;
	}

	public Runnable consumerTask(){
		Runnable runnable=null;
		try {
			runnable=(Runnable)linkedBlockingQueue.take();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return runnable;
	}
}
