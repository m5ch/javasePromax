package jdk8_time;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

/**
 * @ Classname Instant_demo
 * @ Description TODO
 * @ Date 2022/4/14 14:35
 * @ Created by 落尘
 */
public class Instant_demo {
    public static void main(String[] args) {
        //1.创建一个时间戳对象
        Instant instant = Instant.now();
        System.out.println(instant);

        //2.调整系统时区
        Instant instant1 = Instant.from(instant.atZone(ZoneId.systemDefault()));
        System.out.println(instant1);
        System.out.println(instant1.atZone(ZoneId.systemDefault()));

        //3.返回Date对象
        Date date = Date.from(instant);
        System.out.println(date);

        Instant instant2 = date.toInstant();
        System.out.println(instant2);
    }
}
