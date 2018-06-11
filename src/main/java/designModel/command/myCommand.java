package designModel.command;

public class myCommand implements Command{
    private Receiver receiver;

    public myCommand(Receiver receiver)
    {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        this.receiver.action();
    }
}
