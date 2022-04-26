package IOstream.char_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @ Classname demo02
 * @ Description TODO
 * @ Date 2022/4/26 14:00
 * @ Created by 落尘
 */
public class demo02 {
    public static void main(String[] args) {
        try {
            //
            Reader fr = new FileReader("Day09/src/IOstream/char_stream/abcde.txt");

            //
            char[] buffer = new char[1024];  //1024字符

            int len;
            while ((len = fr.read(buffer)) != -1){
                String rs = new String(buffer,0, len);
                System.out.print(rs);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //
    }
}
