package byteBuffer;

import java.io.*;

/**
 * @ Classname demo02
 * @ Description TODO 性能比较
 * @ Date 2022/4/26 17:11
 * @ Created by 落尘
 */
public class demo02 {
    public static final String START = "C:\\Users\\lenovo\\Desktop\\理想\\选择.mp4";
    public static final String END = "E:\\Java_test\\";
    public static void main(String[] args) {
        copy01();   //慢的离谱
        copy02();   //有点慢，但能接受
        copy03();   //挺慢，不建议
        copy04();   //飞快（推荐）
        //
    }

    /**
     *
     */
    private static void copy03() {
        long st = System.currentTimeMillis();
        try (
                //创建字节输入流与源文件接通
                InputStream is = new FileInputStream(START);
                //包装
                InputStream bis = new BufferedInputStream(is);

                //创建字节输出流与目标文件接通
                OutputStream os = new FileOutputStream(END+"new4.mp4");
                //包装
                OutputStream bos = new BufferedOutputStream(os)

        ){
            int len;
            while ((len = bis.read()) != -1){
                bos.write(len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        long en = System.currentTimeMillis();
        System.out.println("方案三："+(en - st) / 1000.0+"s");


    }


    /**
     *
     */
    private static void copy04() {
        long st = System.currentTimeMillis();
        try (
                //创建字节输入流与源文件接通
                InputStream is = new FileInputStream(START);
                //包装
                InputStream bis = new BufferedInputStream(is);
                //创建字节输出流与目标文件接通
                OutputStream os = new FileOutputStream(END+"new3.mp4");
                //包装
                OutputStream bos = new BufferedOutputStream(os)
        ){
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        long en = System.currentTimeMillis();
        System.out.println("方案四：" + (en - st) / 1000.0+"s");
    }

    /**
     * 使用字节流按照字节数组形式复制
     */
    private static void copy02() {
        long st = System.currentTimeMillis();
        try (
                //创建字节输入流与源文件接通
                InputStream is = new FileInputStream(START);
                //创建字节输出流与目标文件接通
                OutputStream os = new FileOutputStream(END+"new2.mp4")
                ){
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1){
                os.write(buffer,0,len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        long en = System.currentTimeMillis();
        System.out.println("方案二：" + (en - st) / 1000.0+"s");

    }

    /**
     * 使用字节流按单个字节形式复制
     */
    private static void copy01() {
        long st = System.currentTimeMillis();
        try (
                //创建字节输入流与源文件接通
                InputStream is = new FileInputStream(START);
                //创建字节输出流与目标文件接通
                OutputStream os = new FileOutputStream(END+"new1.mp4")

                ){
            int len;
            while ((len = is.read()) != -1){
                os.write(len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        long en = System.currentTimeMillis();
        System.out.println("方案一："+(en - st) / 1000.0 +"s");


    }
}
