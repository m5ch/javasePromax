package jdk8_time;

import java.time.LocalDate;

/**
 * @ Classname LocalDate
 * @ Description TODO
 * @ Date 2022/4/12 16:59
 * @ Created by 落尘
 */
public class LocalDate_dome {
    public static void main(String[] args) {
        //获取本地日期对象
        LocalDate nowDate = LocalDate.now();
        System.out.println("日期："+nowDate);

        int year = nowDate.getYear();
        System.out.println("年份:" + year);

        //当年的第几天
        int dayOfYear = nowDate.getDayOfYear();
        System.out.println(dayOfYear);

        //星期
        System.out.println(nowDate.getDayOfWeek());
        System.out.println(nowDate.getDayOfWeek().getValue());

        //月份
        System.out.println(nowDate.getMonth());
        System.out.println(nowDate.getMonth().getValue());

    }
}
