package charBuffer;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ Classname demo03
 * @ Description TODO 完成顺序的恢复并，存入到新文件中
 * @ Date 2022/4/26 19:41
 * @ Created by 落尘
 */
public class demo03 {
    public static void main(String[] args) {
        try (
            //
            BufferedReader br = new BufferedReader(new FileReader("Day10/src/charBuffer/111.txt"));
            //
            BufferedWriter bw = new BufferedWriter(new FileWriter("Day10/src/charBuffer/222.txt"));

                ){

            //定义一个循环按照行读取文章
            List<String> lists = new ArrayList<>();
            String str;
            while((str = br.readLine()) != null){
                lists.add(str);
            }
            //排序
            Collections.sort(lists);

            //写入
            for (String list : lists) {
                bw.write(list);
                bw.newLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
