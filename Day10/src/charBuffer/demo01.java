package charBuffer;

import java.io.*;

/**
 * @ Classname demo01
 * @ Description TODO 学会使用缓冲字符输入流提高字符输入流的性能，新增了按照行读取的方法
 * @ Date 2022/4/26 19:18
 * @ Created by 落尘
 */
public class demo01 {
    public static void main(String[] args) {
        try (
            //创建一个字符输入流管道与源文件接通
//            Reader fr = new FileReader("Day09\\src\\IOstream\\char_stream\\abcd.txt");
            Reader fr = new FileReader("Day10/src/charBuffer/abcde.txt");
            //包低级的字符输入流包装成高级的缓冲字符输入流
            BufferedReader br = new BufferedReader(fr);

                ){

            //读取一个字符返回，美有返回-1
            int code = fr.read();
            System.out.println((char)code);

            //使用循环读取字符
            String code1;
            while ((code1 = br.readLine()) != null){
                System.out.println(code1);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
