package IOstream.char_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @ Classname demo01
 * @ Description TODO 文件字符输入流
 * @ Date 2022/4/26 13:43
 * @ Created by 落尘
 */
public class demo01 {
    public static void main(String[] args) {
        try {
            //创建一个字符输入流管道与源文件接通
//            Reader fr = new FileReader("Day09\\src\\IOstream\\char_stream\\abcd.txt");
            Reader fr = new FileReader("Day09/src/IOstream/char_stream/abcde.txt");

            //读取一个字符返回，美有返回-1
            int code = fr.read();
            System.out.println((char)code);

            //使用循环读取字符
            int code1;
            while ((code1 = fr.read()) != -1){
                System.out.print((char)code1);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
