package designModel.command;

public class mycommand1 implements Command{
    private Receiver receiver;

    public mycommand1(Receiver receiver){
        this.receiver=receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
