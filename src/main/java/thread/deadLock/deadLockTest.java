package thread.deadLock;

public class deadLockTest {

    private final Object lock1=new Object();

    private final Object lock2 =new Object();

    public void test1() throws InterruptedException {
        synchronized (lock1){
            System.out.println("1==lock1");
            Thread.sleep(3000);
            synchronized (lock2){
                System.out.println("1111");
            }
        }
    }

    public void test2() throws InterruptedException {
        synchronized (lock2){
            System.out.println("2==lock2");
            Thread.sleep(1000);
            synchronized (lock1){
                System.out.println("33333");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        deadLockTest deadLockTest=new deadLockTest();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    deadLockTest.test2();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    deadLockTest.test1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}
