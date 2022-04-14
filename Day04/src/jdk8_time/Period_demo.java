package jdk8_time;

import java.time.LocalDate;
import java.time.Period;

/**
 * @ Classname Period_demo
 * @ Description 日期间隔
 * @ Date 2022/4/14 16:18
 * @ Created by 落尘
 */
public class Period_demo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate birthday = LocalDate.of(2002,2,22);
        System.out.println(birthday);

        Period p = Period.between(birthday,today);

        System.out.println(p.getYears());
        System.out.println(p.getMonths());
        System.out.println(p.getDays());
    }
}
