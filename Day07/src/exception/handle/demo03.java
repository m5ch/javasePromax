package exception.handle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ Classname demo03
 * @ Description TODO 异常处理机制
 * @ Date 2022/4/21 20:53
 * @ Created by 落尘
 */
public class demo03 {
    public static void main(String[] args) {
        /*
            前两者结合，出现异常直接抛出去给调用者，调用者捕获处理。
            方法直接将异通过throws抛出去给调用者
            调用者收到异常后直接捕获处理。
         */
        System.out.println("程序开始。。。。。");
        try {
            parseTime("2011-11-11 11:11:11");
            System.out.println("成功！！");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("失败！！");
        }
        System.out.println("程序结束。。。。。");

    }

    private static void parseTime(String s) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(s);
        System.out.println(d);
//        InputStream i = new FileInputStream("G/meinv.jpg");

    }
}
