package LogBack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ Classname demo01
 * @ Description TODO 快速搭建LogBack日志框架记录程序的执行情况，到控制台 到文件中。
 * @ Date 2022/4/22 19:02
 * @ Created by 落尘
 */
public class demo01 {

    public static final Logger logger = LoggerFactory.getLogger("demo.class");
    public static void main(String[] args) {
        try {
            logger.debug("main方法开始执行了");
            logger.info("开始做除法");
            int a = 10;
            int b = 0;
            logger.trace("a = " + a);
            logger.trace("b = " + b);
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("出现异常" + e);
        }
    }
}
