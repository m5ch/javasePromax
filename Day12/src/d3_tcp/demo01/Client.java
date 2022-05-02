package d3_tcp.demo01;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

/**
 * @ Classname Clint
 * @ Description TODO
 * @ Date 2022/5/1 20:47
 * @ Created by 落尘
 */
public class Client {
    public static void main(String[] args) {
        try {
            System.out.println("客户端");
            //1.创建Socket通信管道请求服务端的连接
            /*
                public Socket(String host, int port)
                参数一：服务端ip
                参数二：服务端端口
             */
            Socket socket = new Socket("127.0.0.1",3333);

            //2.从Socket管道中得到一个字节输出流，负责发送数据
            OutputStream os = socket.getOutputStream();

            //包装
            PrintStream ps = new PrintStream(os);

            //3.发送消息
            ps.println("你好~~");
            ps.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
