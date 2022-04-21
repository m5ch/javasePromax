package exception;

/**
 * @ Classname demo01
 * @ Description TODO 运行时异常示例
 * @ Date 2022/4/21 20:32
 * @ Created by 落尘
 */
public class demo01 {
    public static void main(String[] args) {
        /*
            运行时异常示例
         */

        //数组索引越界异常:ArrayIndexOutOfBoundsException
        int[] arr = {1,2,4};
//        System.out.println(arr[3]);

        //空指针异常:NullPointerException，直接输出没有问题，但是调用空指针的变量的功能就会报错。
        String name = null;
//        System.out.println(name.length());

        //数学操作异常:ArithmeticException
//        int c = 10 /0;

        //类型转换异常:ClassCastException
        Object a = 3;
//        String s = (String)a;

        //数字转换异常:NumberFormatException
        String n = "23aabb";
        Integer it = Integer.valueOf(n);
        System.out.println(it);
    }
}
