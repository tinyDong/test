package main.observer;

public class Bo2 extends Bo1{
    public void test(){
        hadChanged();
    }

    public static void main(String[] args) {
        Bo2 b2=new Bo2();
        b2.addOb(new O1());
        b2.test();
    }
}
