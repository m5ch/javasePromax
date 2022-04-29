package timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @ Classname demo01
 * @ Description TODO 定时器的使用和了解
 * @ Date 2022/4/29 16:31
 * @ Created by 落尘
 */
public class demo01 {
    /*
        Timer是单线程，处理多个任务按照顺序执行，存在延时与设置定时器的时间有出入
        可能因为其中的某个任务的异常使Timer线程死掉，从而影响后续任务执行。
     */
    public static void main(String[] args) {
        //1.创建timer定时器
        Timer timer = new Timer();

        //2.调用方法，处理定时任务
        timer.schedule(new TimerTask() {    //定时器本身就是一个单线程
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+
                        "执行");
            }
        },3000,2000);
    }
}
