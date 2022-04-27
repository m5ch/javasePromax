package charBuffer;

import java.io.*;

/**
 * @ Classname demo02
 * @ Description TODO 学会使用缓冲字符输出流提高字符输出流的性能，新增了换行的方法
 * @ Date 2022/4/26 19:32
 * @ Created by 落尘
 */
public class demo02 {
    public static void main(String[] args) {
        try (
                //创建一个字节输出流与目标文件接通
                Writer fw = new FileWriter("Day10/src/charBuffer/qwe.txt");//覆盖管道，每次启动都会清空文件之前的数据
//                Writer fw2 = new FileWriter("Day10/src/charBuffer/qwe.txt",true);//追加管道，每次启动不会清空文件之前的数据

                //包装
                BufferedWriter bw = new BufferedWriter(fw);

        ){
            //写一个字符出去
            bw.write(98);
            bw.write('w');
            bw.write('根');
            bw.newLine();   // bw.write("\r\n"); //换行

            //写一个字符串
            bw.write("发货就会更加快乐");
            bw.newLine();   // bw.write("\r\n"); //换行


            //写字符串的一部分
            bw.write("历史如果建瓯安排",3,4);
            bw.newLine();   // bw.write("\r\n"); //换行


            //写一个字符数组
            char[] a = {'w','f',99};
            bw.write(a);
            bw.newLine();   // bw.write("\r\n"); //换行



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
