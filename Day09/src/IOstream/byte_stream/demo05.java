package IOstream.byte_stream;

import java.io.*;

/**
 * @ Classname demo05
 * @ Description TODO 使用字节流完成文件的复制（支持一切文件类型的复制）
 * @ Date 2022/4/26 11:34
 * @ Created by 落尘
 */
public class demo05 {
    public static void main(String[] args) throws IOException {
        //创建一个字节输入流管道与原文件接通
        File file = new File("C:\\Users\\lenovo\\Desktop\\理想\\选择.mp4");
        InputStream is = new FileInputStream(file);

        //创建一个字节输出流与目标文件接通
        OutputStream os = new FileOutputStream("E:\\Java_test\\选择.mp4");

        //定义一个字节数组转移数据
        byte[] buffer = new byte[1024];
        int len;    //记录每次读取的字节数
        while((len = is.read(buffer)) != -1){
            os.write(buffer,0,len);
        }
        System.out.println("复制完成！");

        //关闭流
        os.close();
        is.close();

    }
}
