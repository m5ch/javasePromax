package transfer_stream;

import java.io.*;

/**
 * @ Classname demo1
 * @ Description TODO 演示一下代码编码与文件编码相同和不同的情况
 * @ Date 2022/4/26 20:08
 * @ Created by 落尘
 */
public class demo1 {
    public static void main(String[] args) {
        try {

            //代码UTF-8       文件GBK
            InputStream is = new FileInputStream("Day10/src/transfer_stream/111.txt");

//            Reader fr = new InputStreamReader(is);   //默认UTF-8，乱码
            Reader fr = new InputStreamReader(is,"GBK");   //指定编码格式，不乱码
            //
            BufferedReader br = new BufferedReader(fr);

            String str;
            while ((str = br.readLine()) != null ){
                System.out.println(str);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
