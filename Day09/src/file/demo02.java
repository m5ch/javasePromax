package file;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * @ Classname demo02
 * @ Description TODO File类的常用API
 * @ Date 2022/4/25 13:41
 * @ Created by 落尘
 */
public class demo02 {
    public static void main(String[] args) {
        //绝对路径创建一个文件对象
        File f = new File("E:\\Java_test\\beauty.JPG");
        //获取绝对路径
        System.out.println(f.getAbsolutePath());
        //获取文件定义时使用的路径
        System.out.println(f.getPath());
        //获取文件的名称(带后缀)
        System.out.println(f.getName());
        //获取文件的大小（字节个数）
        System.out.println(f.length());
        //获取文件最后修改时间
        System.out.println("最后修改时间:"
                + new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(f.lastModified()));
        //判断是文件还是文件夹
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());

        System.out.println("=======================");
        File f2 = new File("Day09\\src\\file\\abc.txt");
        System.out.println(f2.getAbsolutePath());
        System.out.println(f2.exists());
    }
}
