package thread.ThreadPoolTest;


import javax.annotation.PreDestroy;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolUtil {

    private static final int DEFAULT_CORE_POOL_SIZE = Runtime.getRuntime().availableProcessors();

    private static final int DEFAULT_MAX_POOL_SIZE = Runtime.getRuntime().availableProcessors();

    private static final long DEFAULT_KEEP_ALIVE_TIME = 600L;

    private static final String DEFAULT_TASK_NAME = "DEFAULT_TASK";

    private static ThreadPoolExecutor executor;

    private static LinkedBlockingQueue<Runnable> linkedBlockingQueue=new LinkedBlockingQueue<Runnable>(3000);

    public static ThreadPoolExecutor defaultThreadPool(){
        if (executor==null){
            executor=createThreadPool(DEFAULT_CORE_POOL_SIZE,DEFAULT_MAX_POOL_SIZE,DEFAULT_TASK_NAME);
        }
        return executor;
    }

    public static ThreadPoolExecutor newThreadPool(String name){
        return createThreadPool(DEFAULT_CORE_POOL_SIZE,DEFAULT_MAX_POOL_SIZE,name);
    }

    public static ThreadPoolExecutor newThreadPool(Integer coreSize,Integer maxSize,String name){
        return createThreadPool(coreSize,maxSize,name);
    }

    private static ThreadPoolExecutor createThreadPool(int coreSize,int maxSize,String name){
        ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor(coreSize, maxSize, DEFAULT_KEEP_ALIVE_TIME, TimeUnit.SECONDS, linkedBlockingQueue, r -> {
            Thread t = new Thread(r);
            t.setName("threadPoolTaskName:" + name);
//            t.setDaemon();
            t.setPriority(Thread.NORM_PRIORITY);
//            t.run();
            return t;
        }, (r, executor) -> System.out.println("threadPool reject task name:{} ,current thread num"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    @PreDestroy
    private void destroy(){
        executor.shutdown();
    }

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch=new CountDownLatch(1);
        ThreadPoolUtil.defaultThreadPool().execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("promptOptimize.test");
                latch.countDown();
            }
        });
        latch.await();
        System.out.println("over");
    }
}
