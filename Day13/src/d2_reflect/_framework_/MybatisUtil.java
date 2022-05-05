package d2_reflect._framework_;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

/**
 * @ Classname MybatisUtil
 * @ Description TODO 保存任意类型的对象
 * @ Date 2022/5/4 17:21
 * @ Created by 落尘
 */
public class MybatisUtil {
    public static void save(Object o){
        try (
            PrintStream ps = new PrintStream(
                    new FileOutputStream("Day13/src/d2_reflect/_framework_/data.txt",true));
                ){
            //提取对象的全部成员变量（只有反射可以解决）
            Class c = o.getClass();
                    //获取当前类名
            ps.println("============"+c.getSimpleName()+"================");

            //
            Field[] fields = c.getDeclaredFields();

            //获取成员变量的信息
            for (Field field : fields) {
                String name = field.getName();
                //提取本成员变量在对象中的值（取值）
                field.setAccessible(true);
                String value =  field.get(o) + "";
                ps.println(name + "=" + value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
