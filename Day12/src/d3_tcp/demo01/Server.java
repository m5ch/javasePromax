package d3_tcp.demo01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ Classname Server
 * @ Description TODO 开发Socket网络编程入门代码的服务器，实现接收消息
 * @ Date 2022/5/2 14:41
 * @ Created by 落尘
 */
public class Server {
    public static void main(String[] args) {
        try {
            System.out.println("服务端");
            //1.注册端口
            ServerSocket ss = new ServerSocket(3333);

            //2.必须调用accept方法，等待接收客户端的Socket连接请求
             Socket socket = ss.accept();

             //3.从Socket通信管道中得到一个字节输入流
            InputStream is = socket.getInputStream();
            //包装(缓冲字符输入流)
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            //4.按照行读取消息
            String line;
            if ((line = br.readLine()) != null){
                System.out.println(socket.getRemoteSocketAddress() +"发来的:" +line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
