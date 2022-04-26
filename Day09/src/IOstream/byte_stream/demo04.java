package IOstream.byte_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @ Classname demo04
 * @ Description TODO OutputStream
 * @ Date 2022/4/25 20:39
 * @ Created by 落尘
 */
public class demo04 {
    public static void main(String[] args) throws IOException {
        //创建一个文件字节输入流管道与源文件接通。
        OutputStream os1 = new FileOutputStream("Day09/src/IOstream/abc.txt");
        OutputStream os2 = new FileOutputStream("Day09/src/IOstream/abc.txt",true);     //追加
        /*
            写数据出去
         */
        //写一个字节
        os1.write('a');
        os1.write('Z');
        os1.write(99);
        os1.write("\r\n".getBytes());   //换行

        //写一个字节数组
        byte[] buffer1 = {'w',98,67};
        os1.write(buffer1);
        byte[] buffer2 = "我爱你中国".getBytes();
        os1.write(buffer2);
        os1.write("\r\n".getBytes());   //换行

        //写一个字节数组的一部分
        byte[] buffer3 = {'f',88,'r','j'};
        os1.write(buffer3,0,2);

        //写数据必须刷新(可以继续使用流)
        os1.flush();
        //关闭，释放资源（不能继续使用流）
        os1.close();
    }
}
