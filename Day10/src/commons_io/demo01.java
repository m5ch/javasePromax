package commons_io;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @ Classname demo01
 * @ Description TODO commons-io
 * @ Date 2022/4/27 16:49
 * @ Created by 落尘
 */
public class demo01 {
    public static void main(String[] args) throws Exception {

        //完成文件的复制
        IOUtils.copy(new FileInputStream("Day10/src/commons_io/111.txt"),
                new FileOutputStream("Day10/src/commons_io/222.txt"));
        //复制文件到某个文件夹下
        FileUtils.copyFileToDirectory(new File("E:\\Java_test\\beauty.JPG"),
                new File("E:\\Java_test\\bbb\\"));

        //复制文件夹到文件夹
        FileUtils.copyDirectoryToDirectory(new File("E:\\Java_test\\aaa"),
                new File("E:\\Java_test\\bbb\\ccc"));

        //删除文件
        FileUtils.deleteDirectory(new File("E:\\Java_test\\bbb\\ccc\\aaa"));
    }
}
