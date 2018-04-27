package main.netty.Reactor;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

class Reactor implements Runnable {
    final Selector selector;
    final ServerSocketChannel serverSocket;
    Reactor(int port) throws IOException { //Reactor初始化
        selector = Selector.open();
        serverSocket = ServerSocketChannel.open();
        serverSocket.socket().bind(new InetSocketAddress(port));
        serverSocket.configureBlocking(false); //非阻塞
        SelectionKey sk = serverSocket.register(selector, SelectionKey.OP_ACCEPT); //分步处理,第一步,接收accept事件
        sk.attach(new Acceptor()); //attach callback object, Acceptor
    }

    public void run() {
        try {
            while (!Thread.interrupted()) {
                selector.select();
                Set selected = selector.selectedKeys();
                Iterator it = selected.iterator();
                while (it.hasNext())
                    dispatch((SelectionKey)(it.next())); //Reactor负责dispatch收到的事件
                selected.clear();
            }
        } catch (IOException ex) { /* ... */ }
    }

    void dispatch(SelectionKey k) {
        Runnable r = (Runnable)(k.attachment()); //调用之前注册的callback对象
        if (r != null)
            r.run();
    }

    class Acceptor implements Runnable { // inner
        public void run() {
            try {
                SocketChannel c = serverSocket.accept();
                if (c != null)
                    new Handler(selector, c);
            }
            catch(IOException ex) { /* ... */ }
        }
    }



    public static void main(String[] args) {
        try {
            Reactor reactor=new Reactor(8008);
            new Thread(reactor).start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//上面 的实现用Handler来同时处理Read和Write事件, 所以里面出现状态判断
//我们可以用State-Object pattern来更优雅的实现
//class Handler { // ...
//    public void run() { // initial state is reader
//        socket.read(input);
//        if (inputIsComplete()) {
//            process();
//            sk.attach(new Sender());  //状态迁移, Read后变成write, 用Sender作为新的callback对象
//            sk.interest(SelectionKey.OP_WRITE);
//            sk.selector().wakeup();
//        }
//    }
//    class Sender implements Runnable {
//        public void run(){ // ...
//            socket.write(output);
//            if (outputIsComplete()) sk.cancel();
//        }
//    }
//}