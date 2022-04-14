package packageClass;

/**
 * @ Classname Main
 * @ Description TODO
 * @ Date 2022/4/14 17:10
 * @ Created by 落尘
 */
public class Main {
    public static void main(String[] args) {
        int a = 10;
        Integer b = a;      //自动装箱
        System.out.println(a==b);
        Integer c = 20;
        int d = c;      //自动拆箱
        System.out.println(c==d);

        //包装类的变量默认值可以是null容错率更高
//        int a1 = null;      //报错
        Integer a1 = null;    //不报错

        System.out.println("=============");
        //可以把基本类型的数据转换成字符串类型（用处不大）
        Integer a2 = 111;
        System.out.println(a2+1);
        String s = a2.toString();
        System.out.println(s+1);

        String s1 = Integer.toString(a2);
        System.out.println(s1+2);
        //可以直接加字符串
        String s2 = a2+"";
        System.out.println(s2);

        System.out.println("==============");
        //把字符串类型的数值转化为真实的数据类型（有用）
        String age = "23";
        int age1 = Integer.parseInt(age);
        System.out.println(age1+1);

        String num = "99.9";
//        Double num1 = Double.parseDouble(num);
        Double num1 = Double.valueOf(num);
        System.out.println(num1+0.1);

    }
}
