package d3_tcp.demo04;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @ Classname Client
 * @ Description TODO
 * @ Date 2022/5/2 19:49
 * @ Created by 落尘
 */
public class Client {
    public static void main(String[] args) {
        try {
            System.out.println("客户端启动成功~~");
            //1.管道
            Socket socket = new Socket("127.0.0.1",9999);

            //创建一个独立的线程专门这个客户端的读消息
            new ClientReadThread(socket).start();

            //2.输出流
            OutputStream os = socket.getOutputStream();
            //
            PrintStream ps = new PrintStream(os);

            Scanner sc = new Scanner(System.in);
            while(true){
                System.out.println("输入：");
                String st = sc.nextLine();
                ps.println(st);
                ps.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

class ClientReadThread extends Thread{
    private Socket socket;
    public ClientReadThread(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            //3.输入流
            InputStream is = socket.getInputStream();
            //
            BufferedReader bf = new BufferedReader(new InputStreamReader(is));

            //
            String msg;
            while((msg = bf.readLine()) != null){
                System.out.println("收到"+socket.getRemoteSocketAddress()+
                        "发来的:" + msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
