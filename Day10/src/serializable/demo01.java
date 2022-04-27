package serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @ Classname demo01
 * @ Description TODO 对象序列化
 * @ Date 2022/4/26 21:02
 * @ Created by 落尘
 */
public class demo01 {
    public static void main(String[] args) {
        //创建学生对象
        Student s1 = new Student("张三",21,'男');

        try (
            //对象序列话：使用对象字节输出流包装字节输出流管道
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Day10/src/serializable/121.txt"));
            ){

            //直接调用序列化方法
            oos.writeObject(s1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
