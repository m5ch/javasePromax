package printStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @ Classname demo01
 * @ Description TODO 学会使用打印流PrintStream，方便写数据到文件
 * @ Date 2022/4/27 14:36
 * @ Created by 落尘
 */
public class demo01 {
    public static void main(String[] args) throws FileNotFoundException {
        //创建一个打印流对象
        PrintStream ps = new PrintStream("Day10/src/printStream/111.txt");

        ps.println("你不是在逗我吗？");
        ps.println(123);
        ps.println(987.654);
        ps.println(true);
        ps.println('a');

        ps.close();

    }
}
