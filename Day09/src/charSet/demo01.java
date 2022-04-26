package charSet;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @ Classname demo01
 * @ Description TODO 学会自己进行文字的编码和解码,为以后可能用到的场景做准备。
 * @ Date 2022/4/25 19:34
 * @ Created by 落尘
 */
public class demo01 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //1.编码：把文字转换成字节（使用指定的编码）
        String n = "abc我爱你!";
        byte[] bytes1 = n.getBytes();   //当前默认字符集编码
        System.out.println(bytes1.length);
        System.out.println(Arrays.toString(bytes1));

        byte[] bytes2 = n.getBytes("GBK");
        System.out.println(bytes2.length);
        System.out.println(Arrays.toString(bytes2));

        //解码:把字节转换成对应的中文形式(编码前和编码后的字符集必须一致，否则乱码)
        String rs1 = new String(bytes1);
        String rs2 = new String(bytes2,"GBK");
        System.out.println(rs1);
        System.out.println(rs2);
    }
}
