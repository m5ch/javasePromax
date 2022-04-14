package regex;

/**
 * @ Classname demo01
 * @ Description TODO
 * @ Date 2022/4/14 19:37
 * @ Created by 落尘
 */
public class demo01 {
    public static void main(String[] args) {
        System.out.println(check("123456789"));
        System.out.println(check("12345678aa"));
        System.out.println(check("null"));
        System.out.println(check("1289"));
        System.out.println("======================");
        System.out.println(check2("123456789"));
        System.out.println(check2("12345678aa"));
        System.out.println(check2("null"));
        System.out.println(check2("1289"));



    }

    public static boolean check2(String qq){
        return qq != null && qq.matches("\\d{6,20}");

    }

    public static boolean check(String qq){
        if(qq == null || qq.length() >20 || qq.length() < 6)
            return false;
        for (int i = 0; i < qq.length(); i++) {
            char ch = qq.charAt(i);
            if(ch <'0' || ch >'9')
                return false;

        }
        return true;
    }
}
