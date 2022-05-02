package d2_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @ Classname Clint
 * @ Description TODO 服务端
 * @ Date 2022/5/1 19:21
 * @ Created by 落尘
 */
public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("服务端启动");
        //1.创建接收对象：注册端口
        DatagramSocket socket = new DatagramSocket(8888);

        //2.创建一个数据包对象接收数据（韭菜盘子）
        byte[] bytes = new byte[1024 *64];
        DatagramPacket packet = new DatagramPacket(bytes,bytes.length);

        //3.等待接受数据
        socket.receive(packet);

        //4.取出数据
        String rs = new String(bytes,0,packet.getLength());
        System.out.println("收到："+rs);


        //接收发送端的IP和端口
        String ip = packet.getSocketAddress().toString();
        System.out.println("对方地址"+ip);

        //关闭
        socket.close();
    }
}
