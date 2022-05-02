package d1_InetAddress;

import java.net.InetAddress;

/**
 * @ Classname demo01
 * @ Description TODO InetAddress类概述〈（了解） 一个该类的对象就代表一个IP地址对象。
 * @ Date 2022/4/29 20:41
 * @ Created by 落尘
 */
public class demo01 {
    public static void main(String[] args) throws Exception {
        //获取本机地址对象
        InetAddress ip1 = InetAddress.getLocalHost();
        System.out.println(ip1.getHostAddress());
        System.out.println(ip1.getHostName());

        System.out.println("========================");
        //获取域名ip对象
        InetAddress ip2 = InetAddress.getByName("www.baidu.com");
        System.out.println(ip2.getHostAddress());
        System.out.println(ip2.getHostName());

        System.out.println("=====================");
        //获取公网ip对象
        InetAddress ip3 = InetAddress.getByName("36.152.44.95");
        System.out.println(ip3.getHostAddress());
        System.out.println(ip3.getHostName());

        System.out.println("=================");
        //判断是否能通
        System.out.println(ip3.isReachable(5000));

    }
}
