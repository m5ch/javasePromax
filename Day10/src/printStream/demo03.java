package printStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @ Classname demo03
 * @ Description TODO 了解改变输出语句的位置到文件
 * @ Date 2022/4/27 15:01
 * @ Created by 落尘
 */
public class demo03 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("i法国巴苏华给");
        System.out.println("偶爱和吉他");

        //改变位置（重定向）
        PrintStream ps = new PrintStream("Day10/src/printStream/131.txt");
        System.setOut(ps);

        System.out.println("拉格比u");
        System.out.println("感觉哪里看");

    }
}
