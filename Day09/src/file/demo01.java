package file;

import java.io.File;

/**
 * @ Classname demo01
 * @ Description TODO 学会创建File对象定位操作系统的文件（文件、文件夹）
 * @ Date 2022/4/25 13:09
 * @ Created by 落尘
 */
public class demo01 {
    public static void main(String[] args) {
        /*
            常见File对象
         */

        /*
            路径写法
            E:\\Java_test\\beauty.JPG
            E:/Java_test/beauty.JPG
            File.separator
         */
        File f = new File("E:\\Java_test\\beauty.JPG");
        long l = f.length();
        System.out.println(l);

        /*
            2.File常见对象，支持绝对路径，也支持相对路径（重点）
         */
        File f1 = new File("E:\\Java_test\\zhu.png");

        //相对路径一般定位模块中的文件的，相对到工程下
        File f2 = new File("Day09/src/file/abc.txt");
        System.out.println(f2.length());

        //File创建对象，可以是文件，也可以是文件夹
        File f3 = new File("E:\\Java_test");
        System.out.println(f3.exists());    //判断文件路径是否存在

    }
}
