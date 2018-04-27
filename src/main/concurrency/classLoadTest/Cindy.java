package main.concurrency.classLoadTest;

public class Cindy extends Parent{
    static{
        System.out.println("Child was initialized.");
    }
}