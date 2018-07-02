package java8.interfaceDeaultTest;

public class defaultTestImpl implements defaultTest {
    @Override
    public void test() {
        System.out.println("promptOptimize.test");
    }

    public static void main(String[] args) {
        defaultTest t=new defaultTestImpl();
        t.test1();
        t.test();
    }
}
