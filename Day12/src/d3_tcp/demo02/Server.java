package d3_tcp.demo02;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ Classname Server
 * @ Description TODO 实现服务端可以处理多个客户端的消息
 * @ Date 2022/5/2 15:11
 * @ Created by 落尘
 */
public class Server {
    public static void main(String[] args) {
        try {
            System.out.println("服务端");
            //1.注册端口
            ServerSocket ss = new ServerSocket(3333);

            //a。定义一个死循环有主线程负责不断地接收客户端的Socket管道连接
            while (true) {
                //2.必须调用accept方法，等待接收客户端的Socket连接请求
                Socket socket = ss.accept();
                //b.每接收到一个客户端的Socket管道，交给一个独立的子线程负责读取消息
                //c.创建独立线程处理socket
                new ServerReaderThread(socket).start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
