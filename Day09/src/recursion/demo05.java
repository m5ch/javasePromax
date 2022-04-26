package recursion;

/**
 * @ Classname demo05
 * @ Description TODO 啤酒问题
 * @ Date 2022/4/25 18:44
 * @ Created by 落尘
 */
public class demo05 {
    /*
        需求:啤酒2元1瓶，
            4个盖子可以换一瓶，
            2个空瓶可以换一瓶.
            请问10元钱可以喝多少瓶酒，剩余多少空瓶和盖子。
        答案:15瓶3盖子1瓶子
     */
    //定义全局变量
    public static int SUM;  //瓶子总数
    public static int LastCoverNumber;  //剩余盖子总数
    public static int LastBottleNumber;  //剩余盖子总数

    public static void main(String[] args) {
        buy(10);
        System.out.println("酒："+ SUM);
        System.out.println("剩余瓶盖：" + LastCoverNumber);
        System.out.println("剩余瓶子：" + LastBottleNumber);
    }

    private static void buy(int i) {
        int buyNumber = i / 2;
        SUM += buyNumber;
        int covers = LastCoverNumber + buyNumber;
        int bottles = LastBottleNumber + buyNumber;

        int money = 0;
        if (covers >= 4){
            money += (covers / 4) * 2;
        }
        LastCoverNumber = covers % 4;

        if (bottles >= 2){
            money += (bottles / 2) * 2;
        }
        LastBottleNumber = bottles % 2;

        if (money >= 2)
            buy(money);
    }


}
