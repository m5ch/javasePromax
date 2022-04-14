package jdk8_time;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @ Classname Duration_demo
 * @ Description 时间间隔
 * @ Date 2022/4/14 16:40
 * @ Created by 落尘
 */
public class Duration_demo {
    public static void main(String[] args) {
        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalTime t1 = LocalTime.of(22,13,14);
        Duration d = Duration.between(t,t1);

        System.out.println(d.getSeconds());

        System.out.println("===============");
        //
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        LocalDateTime birthday = LocalDateTime.of(2002,2,22,0,0,0);
        System.out.println(birthday);

        Duration d1 = Duration.between(birthday,today);

        System.out.println(d1.toDays());
    }
}
