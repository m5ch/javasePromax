package threadPool;

import java.util.concurrent.*;

/**
 * @ Classname demo02
 * @ Description TODO 方法二
 * @ Date 2022/4/29 15:02
 * @ Created by 落尘
 */
public class demo02 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //
        ExecutorService pool = new ThreadPoolExecutor(3,5,6,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        //给任务线程池处理
        Future<String> f1 = pool.submit(new MyCallable(100));
        Future<String> f2 = pool.submit(new MyCallable(200));
        Future<String> f3 = pool.submit(new MyCallable(300));
        Future<String> f4 = pool.submit(new MyCallable(400));

        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());
    }
}
