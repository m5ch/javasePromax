package printStream;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @ Classname demo02
 * @ Description TODO 学会使用打印流PrintWrite，方便写数据到文件
 * @ Date 2022/4/27 14:51
 * @ Created by 落尘
 */
public class demo02 {
    public static void main(String[] args) throws FileNotFoundException {
        //
        PrintWriter pw = new PrintWriter("Day10/src/printStream/121.txt");

        pw.write("这有什意义呢？");
        pw.write("\r\n");
        pw.println(123);
        pw.write('e');
        pw.write("\r\n");
        pw.println(true);
        pw.write("这不一样吗？");
        pw.write("除了不会换行\r\n");
        pw.println("这不一样吗？");

        pw.close();
    }
}
