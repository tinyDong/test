package main.concurrency.TestThreadPool;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class test {

    private void test1(){
        ByteArrayOutputStream os =new ByteArrayOutputStream();

        try {
            ObjectOutputStream out=new ObjectOutputStream(os);
            out.writeObject(null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
