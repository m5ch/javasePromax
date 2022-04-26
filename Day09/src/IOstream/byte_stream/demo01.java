package IOstream.byte_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @ Classname demo01
 * @ Description TODO Input
 * @ Date 2022/4/25 19:58
 * @ Created by 落尘
 */
public class demo01 {
    public static void main(String[] args) throws IOException {
        //创建一个文件字节输入流管道与源文件接通。
        InputStream is = new FileInputStream("Day09/src/IOstream/abc.txt");

        //读取一个字节返回
//        int a1 = is.read();
//        System.out.println((char)a1);
//        int a2 = is.read();
//        System.out.println((char)a2);
//        int a3 = is.read();
//        System.out.println((char)a3);
//        int a4 = is.read();     //读取完毕返回-1
//        System.out.println((a4));

        /*
            使用循环改进
         */
        //定义一个变量记录每次读取的字节
        int b;
        while((b = is.read()) != -1){
            System.out.println(b);
        }

    }
}
