package recursion;

import java.util.Scanner;

/**
 * @ Classname demo02
 * @ Description TODO 递归的算法和执行流程
 * @ Date 2022/4/25 14:48
 * @ Created by 落尘
 */
public class demo02 {
    /*
        递归算法三要素大体可以总结为:
        递归的公式:f(n) = f(n-1)*n;
        递归的终结点:f(1)
        递归的方向必须走向终结点:
     */
    public static void main(String[] args) {
        //计算 1-n 的阶乘
        Scanner sc = new Scanner(System.in);
        System.out.print("输入：");
        int n = sc.nextInt();

        int sum = fun(n);
        System.out.println(sum);
    }

    private static int fun(int n) {
        if(n == 1 || n == 0){
            return 1;
        }
        else
            return fun(n-1) * n;
    }
}
