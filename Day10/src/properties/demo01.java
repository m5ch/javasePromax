package properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

/**
 * @ Classname demo01
 * @ Description TODO Properties保存
 * @ Date 2022/4/27 15:06
 * @ Created by 落尘
 */
public class demo01 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        properties.setProperty("张三","123456");
        properties.setProperty("李四","666666");
        properties.setProperty("王五","987987");
        System.out.println(properties);


        /*
            参数一：保存管道
            参数二：注释
         */
        properties.store(new FileWriter("Day10/src/properties/111.properties"),
                "pay me 100!");


    }
}
