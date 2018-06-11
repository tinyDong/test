package designModel.observer;

import java.util.Observable;
import java.util.Observer;

public class observerTest implements Observer{

    @Override
    public void update(Observable o, Object arg) {
        NumObservable myObserable=(NumObservable) o;
        System.out.println("Data has changed to " +myObserable.getA());

    }

    public static void main(String[] args) {
        NumObservable numObservable=new NumObservable();
        numObservable.addObserver(new observerTest());
        numObservable.setA(1);
    }
}
