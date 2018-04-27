package main.observer;

public class Bo1 {

    private Obser obser;

    public void addOb(Obser obser){
        this.obser=obser;
    }

    public void hadChanged(){
        this.obser.doChange();
    }


}
