package file;

import java.io.File;

/**
 * @ Classname demo04
 * @ Description TODO 遍历文件夹
 * @ Date 2022/4/25 14:27
 * @ Created by 落尘
 */
public class demo04 {
    public static void main(String[] args) {
        /*
            注意事项
            1.如果目录不存在，则返回null
            2.当调用者是一个文件时，返回null
            3.当调用者是一个空文件夹时，返回一个长度为O的数组
            4.当调用者是一个有内容的文件夹时，将里面所有文件和文件夹的路径放在File数组中返回
            5.当调用者是一个有隐藏文件的文件夹时，将里面所有文件和文件夹的路径放在File数组中返回，包含隐藏内容
            6.当调用者是一个需要权限才能进入的文件夹时，返回null
         */

        File f = new File("E:\\Java_test\\");

        //获取当前目录下所有的”一级文件名称"到一个字符串数组中去返回。
        String[] names = f.list();
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("======================");
        //获取当前目录下所有的"一级文件对象"到一个文件对象数组中去返回（重点）
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }


    }
}
