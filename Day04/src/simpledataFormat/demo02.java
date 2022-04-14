package simpledataFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ Classname demo02
 * @ Description 学会使用SimpleDateFoemat解析字符串时间成为日期对象
 * @ Date 2022/4/11 20:44
 * @ Created by 落尘
 */
public class demo02 {
    public static void main(String[] args) throws ParseException {
        // Task：请计算出2021年08月06日11点11分11秒，往后走2天14小时49分06秒后的时间是多少。

        //1.把字符串时间解拿到程序中来
        String str = "2021年08月06日 11:11:11";

        //2.把字符串时间解析成日期对象
        //形式必须与被解析时间的形式完全一样，否则运行时解析报错！！
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d = sdf.parse(str);
        System.out.println(d);

        //3.往后走2天14小时49分06秒
        long d1 = d.getTime() + (2L * 24 * 60 * 60 + 14 * 60 * 60 + 49 * 60 +6) * 1000;

        //4.格式化这个时间毫秒值
        String str1 = sdf.format(d1);
        System.out.println(str1);
        System.out.println(sdf.format(d1));
    }
}
