package threadPool;

/**
 * @ Classname MyRunnable
 * @ Description TODO
 * @ Date 2022/4/29 13:34
 * @ Created by 落尘
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "子线程：" + i);
            try {
                System.out.println(Thread.currentThread().getName()+"任务睡着了！");
                Thread.sleep(10000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
