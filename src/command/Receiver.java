package command;

public class Receiver {
    public void action()
    {
        System.out.println("command received!");
    }

    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        Command cmd = new myCommand(receiver);
        Command cmd1=new mycommand1(receiver);

        Invoker invoker = new Invoker(cmd1);
        invoker.action();


    }
}
