package thread;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class interrupte {
    public static void main(String[] args) throws InterruptedException {

        List l=new ArrayList();
        Iterator t=l.iterator();
        if (t.hasNext()){
            t.remove();
        }
    }

}
