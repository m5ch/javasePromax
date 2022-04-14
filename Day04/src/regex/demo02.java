package regex;

import java.util.Scanner;

/**
 * @ Classname demo02
 * @ Description 校验手机号码、邮箱、
 * @ Date 2022/4/14 19:55
 * @ Created by 落尘
 */
public class demo02 {
    public static void main(String[] args) {

    }

    public static void checkNum(String num){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入：");
        while(true){
            String s = sc.next();
            if (s.matches("1[3-9]\\d{9}")){
                System.out.println("完成");
                break;
            }
            else
                System.out.println("格式有误！！请重新输入：");
        }
    }
}
