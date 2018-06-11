package thread.concurrency.volitail;

public class TestVolitail {
    public Integer x;

    public static void main(String[] args) {
        final TestVolitail t1=new TestVolitail();

        new Thread(new Runnable() {
            @Override
            public void run() {
                t1.x=1;
                t1.x=2;
                t1.x=3;
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(t1.x);
            }
        }).start();
    }
}
