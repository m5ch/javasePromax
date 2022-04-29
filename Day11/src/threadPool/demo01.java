package threadPool;

import java.util.concurrent.*;

/**
 * @ Classname demo01
 * @ Description TODO 自定义一个线程池对象，并测试其特性。
 * @ Date 2022/4/29 13:00
 * @ Created by 落尘
 */
public class demo01 {
    public static void main(String[] args) {
        /*
            参数一:指定线程池的线程数量（核心线程): corePoolSize
            参数二:指定线程池可支持的最大线程数:maximumPoolSize
            参数三:指定临时线程的最大存活时间:keepAliveTime
            参数四:指定存活时间的单位(秒、分、时、天):unit
            参数五:指定任务队列: workQueue
            参数六:指定用哪个线程工厂创建线程:threadFactory
            参数七:指定线程忙，任务满的时候，新任务来了怎么办:handler
         */

        //创建线程池对象
        /*
        public ThreadPoolExecutor(int corePoolSize,
                      int maximumPoolSize,
                      long keepAliveTime,
                      TimeUnit unit,
                      BlockingQueue<Runnable> workQueue,
                      ThreadFactory threadFactory,
                      RejectedExecutionHandler handler)
         */
        ExecutorService pool = new ThreadPoolExecutor(3,5,
                6, TimeUnit.SECONDS,new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        //给任务给线程池处理
        Runnable target = new MyRunnable();
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);


        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);

        //创建临时线程
        pool.execute(target);
        pool.execute(target);

        //不创建线程，拒绝策略被触发
//        pool.execute(target);

        //关闭线程池（开发中一般不会使用）
        pool.shutdownNow();  //立即关闭，即使任务没有完成，会丢失任务！！
//        pool.shutdown();    //会等待全部任务执行完毕后再关闭（建议使用）

    }
}
