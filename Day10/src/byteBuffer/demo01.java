package byteBuffer;

import java.io.*;

/**
 * @ Classname demo01
 * @ Description TODO 使用字节缓冲流完成文件的读写
 * @ Date 2022/4/26 16:56
 * @ Created by 落尘
 */
public class demo01 {
    public static void main(String[] args) {
        try (
                //这里面只能放置资源对象，自动调用资源的close方法关闭资源（即使出现异常也会执行操作）
                //创建一个字节输入流与源文件接痛
                InputStream is = new FileInputStream("C:\\Users\\lenovo\\Desktop\\理想\\选择.mp4");
                //把原始的字节输入流包装成高级的字节缓冲输入流
                InputStream bis = new BufferedInputStream(is);

                //创建一个字节输出流与目标文件接痛
                OutputStream os = new FileOutputStream("E:\\Java_test\\new.mp4");
                //把原始的字节输入流包装成高级的字节缓冲输入流
                OutputStream bos = new BufferedOutputStream(os);

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
    }
}
