package transfer_stream;

import java.io.*;

/**
 * @ Classname demo02
 * @ Description TODO
 * @ Date 2022/4/26 20:47
 * @ Created by 落尘
 */
public class demo02 {
    public static void main(String[] args) throws Exception {
        //字节流
        OutputStream os = new FileOutputStream("Day10/src/transfer_stream/222.txt");
        //转换为字符输出流
//        Writer osw = new OutputStreamWriter(os);  //默认UTF-8,和直接写FileWrite一样
        Writer osw = new OutputStreamWriter(os, "GBK");
        //包装
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("阿拉贡哈喽");
        bw.write("我爱你中国");
        bw.write("无人之处说爱你");

        bw.close();

    }
}
