package simpledataFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ Classname demo01
 * @ Description SimpleDateFormat类简单日期格式化
 * @ Date 2022/4/11 20:37
 * @ Created by 落尘
 */
public class demo01 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        //格式化日期对象
        SimpleDateFormat d1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");

        //开始格式化
        String rs = d1.format(d);
        System.out.println(rs);
    }
}
