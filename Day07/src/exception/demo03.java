package exception;

import java.util.Scanner;

/**
 * @ Classname demo03
 * @ Description TODO
 * @ Date 2022/4/21 21:47
 * @ Created by 落尘
 */
public class demo03 {
    public static void main(String[] args) {
        /*
            需求：输入一个合理的价格为止，要求价格大于0
         */
        Scanner sc = new Scanner(System.in);
        while(true){
            try {
                System.out.print("输入合法的价格：");
                String str = sc.nextLine();
                Double n = Double.valueOf(str);
                if (n > 0){
                    System.out.println("价格为" + n);
                    break;
                }
                else
                    System.out.println("请输入正数~~");
            } catch (NumberFormatException e) {
                System.out.println("请输入合法的数值~~");
            }
        }
    }
}
