package main.concurrency.disruptor;

public final class FalseSharing implements Runnable {

    public final static int NUM_THREADS = 4; // change
    public final static long ITERATIONS = 500L * 1000L * 1000L;

    private final int arrayIndex;

    private static VolatileLong[] longs = new VolatileLong[NUM_THREADS];

    static {
        for (int i = 0; i < longs.length; i++)
        {
            longs[i] = new VolatileLong();
        }
    }


    public FalseSharing(final int arrayIndex)
    {
        this.arrayIndex = arrayIndex;
    }

    public static void main(final String[] args) throws Exception
    {
        final long start = System.nanoTime();
        runTest();
        System.out.println("duration = " + (System.nanoTime() - start));
    }

    private static void runTest() throws InterruptedException
    {
        Thread[] threads = new Thread[NUM_THREADS];
        for (int i = 0; i < threads.length; i++)
        {
            threads[i] = new Thread(new FalseSharing(i));
        }
        for (Thread t : threads)
        {
            t.start();
        }

        for (Thread t : threads)
        {
            t.join();
        }
    }

    public void run()
    {
        long i = ITERATIONS + 1;
        while (0 != --i)
        {
            longs[arrayIndex].value = i;
        }
    }

    public final static class VolatileLong
    {
        //填充6
//        19868269227
        //19305862826
        //19206077866

//        填充7
//        9872153174
//        10310201173
//        9745651627
         //填充5
//        19401640960
//        18800980053

//        不填充
//        15967457706
//        16538636373
//        16921162240

        //上下填充
//        18800980053
//        9966253653
//        10225796267
//        9775066880


        long p1, p2, p3, p4, p5; // comment out
        public volatile long value = 0L;

        long p8, p9, p10, p11, p12, p13, p14;
    }
}

