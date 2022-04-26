package IOstream.byte_stream;

import java.io.*;

/**
 * @ Classname demo03
 * @ Description TODO 使用文件字节输入流一次读完文件的全部字节。可以解决乱码问题。
 * @ Date 2022/4/25 20:27
 * @ Created by 落尘
 */
public class demo03 {
    public static void main(String[] args) throws IOException {

        //创建一个文件字节输入流管道与源文件接通。
        File file = new File("Day09/src/IOstream/abcde.txt");
        InputStream is = new FileInputStream(file);

        //定义一个字节数组与文件的大小刚刚一样大
        byte[] buffer = new byte[(int)file.length()];
        int len = is.read(buffer);
        System.out.println("文件大小" + file.length());
        System.out.println(len);
        System.out.println(new String(buffer));

        System.out.println("====================");
        //快捷方式
        byte[] buffer1 = is.readAllBytes();
        System.out.println(new String(buffer));
    }
}
