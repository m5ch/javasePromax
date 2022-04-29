package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @ Classname demo04
 * @ Description TODO 线程的创建方式三：实现Callable接口，结合FutureTask完成
 * @ Date 2022/4/28 15:21
 * @ Created by 落尘
 */
public class demo04 {
    /*
        优缺点：
        优点:线程任务类只是实现接口，可以继续继承类和实现接口，扩展性强。
            可以在线程执行完毕后去获取线程执行的结果。
        缺点:编码复杂一点。
     */
    public static void main(String[] args) {
        //3.创建Callable任务对象
        Callable<String> call = new MyCallable(100);

        //4.把Callable任务对象交给FutureTask对象.
        /*
            FutureTask对象的作用：
            1.是Runnable的对象（实现了Runnable接口)，可以交给Thread了
            2.可以在线程执行完毕之后通过调用其get方法得到线程执行完成的结果
         */
        FutureTask<String> ft = new FutureTask<>(call);

        //5.交给线程处理
        Thread t = new Thread(ft);

        //6.启动线程
        t.start();

        System.out.println("===============================");

        Callable<String> call1 = new MyCallable(200);
        FutureTask<String> ft1 = new FutureTask<>(call1);
        Thread t1 = new Thread(ft1);
        t1.start();

        try {
            //如果任务没有执行完毕，这里的代码会等待，直到线程跑完才提取结果。
            String rs = ft.get();
            System.out.println("1:"+rs);
            String rs1 = ft1.get();
            System.out.println("2:"+rs1);
        }
        catch (Exception e)
        {
         e.printStackTrace();
        }

    }
}



// 1.定义一个任务类，实现Callable接口

class MyCallable implements Callable<String>{
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    //2.重写call方法（任务方法）
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return "结果是" + sum;
    }
}
