import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main{

    public static void main(String[] args) {

        final Map<Integer, Integer> map = new HashMap<>(1);
        for (int i = 0; i < 10000; i++) {
            System.out.println("start");
            Thread t = new Thread() {
                Random rnd = new Random();

                @Override
                public void run() {
                    for (int i = 0; i < 100; i++) {
                        map .put(rnd.nextInt(), 1);
                    }
                }
            };
            t.start();
        }

    }


}

