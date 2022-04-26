package recursion;

/**
 * @ Classname demo03
 * @ Description TODO 猴子吃桃问题
 * @ Date 2022/4/25 15:01
 * @ Created by 落尘
 */
public class demo03 {
    /*
        猴子第一天摘下若干桃子，当即吃了一半，觉得好不过瘾，于是又多吃了一个
        第二天又吃了前天剩余桃子数量的一半，觉得好不过瘾，于是又多吃了一个
        以后每天都是吃前天剩余桃子数量的一半，觉得好不过瘾，又多吃了一个
        等到第10天的时候发现桃子只有1个了。
        需求:请问猴子第一天摘了多少个桃子?
     */
    public static void main(String[] args) {
        int sum;
        sum = fun(1);
        System.out.println(sum);
    }

    private static int fun(int i) {
        if(i == 10){
            return 1;
        }
        return (fun(i + 1) + 1) * 2;
    }


}
