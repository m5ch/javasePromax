package threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ Classname demo03
 * @ Description TODO 使用Executors的工具类方法直接得到一个线程池对象
 * @ Date 2022/4/29 15:38
 * @ Created by 落尘
 */
public class demo03 {
    public static void main(String[] args) {
        //创建固定线程数量的线程池
        ExecutorService pool = Executors.newFixedThreadPool(3);

        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());

        pool.execute(new MyRunnable());     //已经没有多余的线程了
    }
}
