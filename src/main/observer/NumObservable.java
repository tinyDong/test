package main.observer;

import java.util.Observable;

public class NumObservable extends Observable {
    private int a=0;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
        setChanged();
        notifyObservers();
    }
}
