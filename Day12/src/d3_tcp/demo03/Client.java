package d3_tcp.demo03;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @ Classname Client
 * @ Description TODO 使用线程池，优化导入
 * @ Date 2022/5/2 15:55
 * @ Created by 落尘
 */
public class Client {
    public static void main(String[] args) {
        try {
            System.out.println("客户端启动");
            //1.
            Socket socket = new Socket("127.0.0.1",9999);


            //2.输出流
            OutputStream os = socket.getOutputStream();
            //包装
            PrintStream ps = new PrintStream(os);

            //3.
            Scanner sc = new Scanner(System.in);
            while(true){
                System.out.print("输入：");
                String st = sc.nextLine();
                ps.println(st);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
