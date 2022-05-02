package d2_udp.task;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @ Classname Server
 * @ Description TODO 发送端
 * @ Date 2022/5/1 20:00
 * @ Created by 落尘
 */
public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("客户端启动");
        //1.创建发送对象(发送端自带端口号)
        DatagramSocket socket = new DatagramSocket();

        //2.创建一个数据包对象封装对象（韭菜盘子）
        /*
                public DatagramPacket(byte buf[], int offset, int length,
                          InetAddress address, int port)
                参数一：封装要发送的数据（jiucai）
                参数二：发送数据的大小
                参数三：服务端的主机IP地址
                参数四：服务端的端口
         */
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("输入:");
            String st = sc.nextLine();
            if ("exit".equals(st)){
                socket.close();
                break;
            }
            byte[] bytes = st.getBytes();
            DatagramPacket packet = new DatagramPacket(bytes,bytes.length,
                    InetAddress.getLocalHost(),8888);

            //3.发送数据
            socket.send(packet);
        }
;
    }
}
