package thread_api;

/**
 * @ Classname demo02
 * @ Description TODO Sleep
 * @ Date 2022/4/28 16:22
 * @ Created by 落尘
 */
public class demo02 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程输出："+i);
            if (i == 5)
                //暂停3秒
                Thread.sleep(3000);
        }
    }
}
