package main.Singleton;

public class Singleton{
    private static Singleton singleton;

    public static Singleton getSingleton() {
        if (singleton==null){
            synchronized (Singleton.class){
                if (singleton==null){
                    singleton=new Singleton();
                }
            }
        }
        return singleton;
    }

    private Singleton(){}

    private static class InnerClass{
        private static Singleton instanc=new Singleton();
    }

    public static final Singleton getS1(){
        return InnerClass.instanc;
    }

    public static void main(String[] args) {

    }
}
