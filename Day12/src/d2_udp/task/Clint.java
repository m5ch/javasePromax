package d2_udp.task;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @ Classname Clint
 * @ Description TODO 服务端
 * @ Date 2022/5/1 20:00
 * @ Created by 落尘
 */
public class Clint {
    public static void main(String[] args) throws Exception {
        System.out.println("服务端启动");
        //1.创建接收对象：注册端口
        DatagramSocket socket = new DatagramSocket(8888);

        //2.创建一个数据包对象接收数据（韭菜盘子）
        byte[] bytes = new byte[1024 *64];
        DatagramPacket packet = new DatagramPacket(bytes,bytes.length);

        //3.等待接受数据
        while (true) {
            socket.receive(packet);

            //4.取出数据
            String rs = new String(bytes,0,packet.getLength());
            String ip = packet.getSocketAddress().toString();
            System.out.println("收到地址为" + ip +"的弹幕："+ rs);
        }

    }
}
