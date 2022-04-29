package timer;

import java.util.Date;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @ Classname demo02
 * @ Description TODO 创建ScheduledExecutorService线程池，做定时器
 * @ Date 2022/4/29 16:42
 * @ Created by 落尘
 */
public class demo02 {
    /*
        优点：
        基于线程池，某个任务的执行情况不会影响其他定时任务的执行。
     */
    public static void main(String[] args) {
        //创建
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(3);

        //开启定时任务
        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+
                        "执行输出：AAA ==>"+new Date());
                try {
                    Thread.sleep(10000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },0,2, TimeUnit.SECONDS);

        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+
                        "执行输出：BBB ==>"+new Date());
            }
        },0,2, TimeUnit.SECONDS);

        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+
                        "执行输出：CCC ==>"+new Date());
                //添加bug
                System.out.println(10 / 0);
            }
        },0,2, TimeUnit.SECONDS);


    }
}
