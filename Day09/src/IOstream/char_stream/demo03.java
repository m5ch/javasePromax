package IOstream.char_stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @ Classname demo03
 * @ Description TODO 文件字符输出流
 * @ Date 2022/4/26 14:08
 * @ Created by 落尘
 */
public class demo03 {
    public static void main(String[] args) {
        try (
            //创建一个字节输出流与目标文件接通
           Writer fw1 = new FileWriter("Day09/src/IOstream/char_stream/qwe.txt");//覆盖管道，每次启动都会清空文件之前的数据
           Writer fw2 = new FileWriter("Day09/src/IOstream/char_stream/qwe.txt",true);//追加管道，每次启动不会清空文件之前的数据

        ){
            //写一个字符出去
            fw1.write(98);
            fw1.write('w');
            fw1.write('根');
            fw1.write("\r\n"); //换行

            //写一个字符串
            fw1.write("发货就会更加快乐");
            fw1.write("\r\n");

            //写字符串的一部分
            fw1.write("历史如果建瓯安排",3,4);
            fw1.write("\r\n");

            //写一个字符数组
            char[] a = {'w','f',99};
            fw1.write(a);
            fw1.write("\r\n");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
