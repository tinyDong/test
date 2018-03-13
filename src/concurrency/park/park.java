package concurrency.park;

import java.util.concurrent.locks.LockSupport;

public class park {

    public static void main(String[] args) {


//        LockSupport.unpark(thread);
//        LockSupport.unpark(thread);

        System.out.println("a");
        LockSupport.park();
        System.out.println("b");
        LockSupport.park();
        System.out.println("c");
    }

}
