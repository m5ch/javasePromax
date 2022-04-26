package file;

import java.io.File;

/**
 * @ Classname demo03
 * @ Description TODO File类的创建、删除文件
 * @ Date 2022/4/25 13:59
 * @ Created by 落尘
 */
public class demo03 {
    public static void main(String[] args) {
        File f = new File("E:\\Java_test\\aaa");

        // mkdir 创建一级目录
        System.out.println(f.mkdir());
//        System.out.println(f.exists());
        // mkdirs 创建多级目录
        File f1 = new File("E:\\Java_test\\bbb\\ccc");
        System.out.println(f1.mkdirs());

        //删除文件或空文件夹(只能删除空文件夹，不能删除飞控文件夹)
//        System.out.println(f1.delete());

    }
}
