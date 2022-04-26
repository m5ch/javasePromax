package recursion;

/**
 * @ Classname demo01
 * @ Description TODO 递归的形式
 * @ Date 2022/4/25 14:41
 * @ Created by 落尘
 */
public class demo01 {
    static int i = 0;
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        i++;
        System.out.println("=====test被执行=====");
        if (i == 10)
            return;
        test();
    }
}
