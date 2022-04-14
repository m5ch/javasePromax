package date;

import java.util.Date;

/**
 * @ Classname demo01
 * @ Description 学会使用Date类处理时间，获取时间的信息
 * @ Date 2022/4/11 20:19
 * @ Created by 落尘
 */
public class demo01 {
    public static void main(String[] args) {
        //创建一个Date类的对象，代表系统此刻日期时间对象
        Date date = new Date();
        System.out.println(date);

        //获取时间毫秒值
        long t = date.getTime();
        System.out.println(t);

        /*
            请计算出当前时间往后走1小时121秒之后的时间是多少。
         */
        Date d = new Date();
        System.out.println(d);

        long time = System.currentTimeMillis();
        time += (60 * 60 + 121) * 1000;

        Date time1 = new Date(time);
        System.out.println(time1);

        Date time2 = new Date();
        time2.setTime(time);
        System.out.println(time2);

    }
}
