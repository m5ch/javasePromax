package properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

/**
 * @ Classname demo02
 * @ Description TODO Properties 读取
 * @ Date 2022/4/27 16:26
 * @ Created by 落尘
 */
public class demo02 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        System.out.println(properties);

        //加载属性文件中的键值对数据到属性对象properties中
        properties.load(new FileReader("Day10/src/properties/111.properties"));

        System.out.println(properties);

        String rs = properties.getProperty("张三");
        System.out.println(rs);

        Set<String> names = new HashSet<>();
        names = properties.stringPropertyNames();
        System.out.println(names);
    }
}
