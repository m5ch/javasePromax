package recursion;

import java.io.File;

/**
 * @ Classname demo04
 * @ Description TODO 文件搜索
 * @ Date 2022/4/25 18:09
 * @ Created by 落尘
 */
public class demo04 {
    public static void main(String[] args) {
        //传入目录和文件名
        File f = new File("E:\\Java_test");
        SearchFile(f,"qer.txt");

    }

    /**
     * 搜索某个目录下的全部文件，找到我们想要的文件。
     * @param dir 被搜索的源目录
     * @param fileName 被搜索的文件名称
     */
    private static void SearchFile(File dir,String fileName) {
        //判断是否是目录
        if (dir == null || !dir.isDirectory())
            System.out.println("对不起，不支持搜索！");
        else{
            //提取当前目录的下一级文件对象
            File[] files = dir.listFiles();
            //判断是否存在一级文件对象，存在才可以遍历
            if (files != null || files.length > 0){
                for (File file : files) {
                    //判断当前遍历的一级文件对象是文件还是目录
                    if (file.isFile()){
                        //比较是否是要找的
                        if (file.getName().contains(fileName))
                            System.out.println(file.getAbsolutePath());
                    }
                }
            }
            else{
                System.out.println("未找到");
            }
        }
    }
}
