package IOstream.byte_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @ Classname demo02
 * @ Description TODO 使用文件字节输入流每次读取一个字节数组的数据。
 * @ Date 2022/4/25 20:10
 * @ Created by 落尘
 */
public class demo02 {
    public static void main(String[] args) throws IOException {
        //创建一个文件字节输入流管道与源文件接通。
        InputStream is = new FileInputStream("Day09/src/IOstream/abcd.txt");

        //定义一个字节数组，用于读取字节数
        byte[] buffer = new byte[3];  //3B

        //使用循环，每次读取一个字节数组
        int len;    //记录每次读取的字节数
        while((len = is.read(buffer)) != -1){
            //读多少，倒多少
            System.out.println(new String(buffer,0,len));
//            System.out.println("读取了"+len+"个字节！");
        }
    }
}
