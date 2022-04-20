package Collections.param;

import java.util.Arrays;

/**
 * @ Classname demo01
 * @ Description TODO 可变参数
 * @ Date 2022/4/20 13:38
 * @ Created by 落尘
 */
public class demo01 {
    public static void main(String[] args) {
        //1.不传参数
        sum();
        //2.传输一个参数
        sum(10);

        //3.传输多个参数
        sum(12,34,56);
    }

    /*
        一个形参列表中只能有一个可变参数
        可变参数必须放在形参列表的最后面
     */
    public static void sum(int ...nums){
        //可变参数在方法内部就是一个数组
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
    }
}
