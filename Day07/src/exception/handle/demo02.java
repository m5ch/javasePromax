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
public class demo02 {
    public static void main(String[] args) {
        /*
            出现异常自己捕获处理，不麻烦别人。
            监视捕获异常，用在方法内部，可以将方法内部出现的异常直接捕获处理。
            这种方式还可以，发生异常的方法自己独立完成异常的处理，程序可以继续往下执行。
         */
        System.out.println("程序开始。。。。。");
        try {
            parseTime("2011-11-11 11:11:11");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("程序结束。。。。。");

    }

    private static void parseTime(String s) throws ParseException {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM-dd HH:mm:ss");
            Date d = sdf.parse(s);
            System.out.println(d);
            InputStream i = new FileInputStream("G/meinv.jpg");
        } catch (ParseException e) {
            //解析出现问题
//            System.out.println("出现时间异常");
            e.printStackTrace();
        }
        catch (FileNotFoundException e) {
//            System.out.println("找不到该文件");
            e.printStackTrace();
        }
    }
}
