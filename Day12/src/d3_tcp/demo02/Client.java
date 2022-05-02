package d3_tcp.demo02;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @ Classname Clint
 * @ Description TODO 实现服务端可以处理多个客户端的消息
 * @ Date 2022/5/2 15:11
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
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("输入：");
                String st = sc.nextLine();
                ps.println(st);
                ps.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
