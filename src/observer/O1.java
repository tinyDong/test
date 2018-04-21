package observer;

public class O1 implements Obser{
    @Override
    public void doChange() {
        System.out.println("changed");
    }
}
