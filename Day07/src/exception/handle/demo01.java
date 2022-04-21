package exception.handle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ Classname demo03
 * @ Description TODO 异常处理机制
 * @ Date 2022/4/21 20:53
 * @ Created by 落尘
 */
public class demo01 {
        //出现异常直接抛出去给调用者，调用者也继续抛出去。
        //这种方式并不好，发生异常的方法自己不处理异常，如果异常最终抛出去给虚拟机将引起程序死亡。
    public static void main (String[ ]args) throws ParseException {
        System.out.println("程序开始。。。。。");
        parseTime("2011-11-11 11:11:11");
        System.out.println("程序结束。。。。。");
    }

    private static void parseTime(String s) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM-dd HH:mm:ss");
        Date d = sdf.parse(s);
        System.out.println(d);
    }
}