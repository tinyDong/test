package thread.concurrency.reentrantLock;

public class synchronizeTest {

    private Object lock1=new Object();
    private Object lock2=new Object();

    public static void main(String[] args) {
        final synchronizeTest test=new synchronizeTest();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                test.test1();
                test.test2();
            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
//               test.test2();
            }
        });

        t1.start();
        t2.start();
    }

    private void test1(){
        synchronized (lock1){
            System.out.println("test111111");
            System.out.println("开始等待lock2");
//            synchronized (lock2){
//                test2();
//            }
        }

    }

    void test2(){
        synchronized (lock1){

            System.out.println("test2222222");
            try {
                Thread.sleep(1000);
//                synchronized (lock1){
                    System.out.println("开始等待lock1");
//                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
