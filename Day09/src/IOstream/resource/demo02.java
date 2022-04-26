package IOstream.resource;

import java.io.*;

/**
 * @ Classname demo01
 * @ Description TODO 释放资源
 * @ Date 2022/4/26 12:00
 * @ Created by 落尘
 */
public class demo02 {
    public static void main(String[] args) {
        try (
                //这里面只能放置资源对象，自动调用资源的close方法关闭资源（即使出现异常也会执行操作）
                //创建一个字节输入流与源文件接痛
                InputStream is = new FileInputStream("C:\\Users\\lenovo\\Desktop\\理想\\选择.mp4");

                //创建一个字节输出流与目标文件接痛
                OutputStream os = new FileOutputStream("E:\\Java_test\\new.mp4");

                //int a = 23; //只能放资源
                ){
            //创建一个字符集用于存储数据
            byte[] buffer = new byte[1024];

            int len;

            while((len = is.read(buffer)) != -1){
                os.write(buffer,0,len);
            }
            //复制完成！
            System.out.println("复制完成");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        finally {
//            try {
//                if (os != null)
//                    os.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                if (is != null)
//                    is.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    }
}
