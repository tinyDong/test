package thread.concurrency.classLoadTest;

public class Parent extends Grandpa{
    static String language = "Chinese";
    static{
        System.out.println("Parent was initialized.");
    }
}
