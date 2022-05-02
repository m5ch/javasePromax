package d2_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @ Classname Server
 * @ Description TODO 发送端
 * @ Date 2022/5/1 19:21
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
        byte[] bytes = "Hello World!!!".getBytes();
        DatagramPacket packet = new DatagramPacket(bytes,bytes.length,
                InetAddress.getLocalHost(),8888);

        //3.发送数据
        socket.send(packet);


        //关闭
        socket.close();
    }
}
