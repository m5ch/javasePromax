package serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

/**
 * @ Classname demo02
 * @ Description TODO 对象反序列化
 * @ Date 2022/4/27 14:20
 * @ Created by 落尘
 */
public class demo02 {
    public static void main(String[] args) throws Exception {
        //创建对象字节输入流管道包装低级的字节输入流管道
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Day10/src/serializable/121.txt"));

        //调用对象字节输入流的反序列化方法
        Student s = (Student) ois.readObject();

        //
        ois.close();
        System.out.println(s);
    }
}
