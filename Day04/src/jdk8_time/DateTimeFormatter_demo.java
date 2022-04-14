package jdk8_time;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @ Classname DateTimeFormatter_demo
 * @ Description TODO
 * @ Date 2022/4/14 15:42
 * @ Created by 落尘
 */
public class DateTimeFormatter_demo {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        //解析 格式化
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd EEE HH:mm;ss");

        //正向格式化
        System.out.println(dtf.format(ldt));

        //逆向格式化 （输出是一样的）
        System.out.println(ldt.format(dtf));

        //解析字符串时间
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a");
        LocalDateTime d = LocalDateTime.parse("2020-12-21 11:13:14 上午" , dtf1);
        System.out.println(d);
    }
}
