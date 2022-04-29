package thread;

/**
 * @ Classname demo02
 * @ Description TODO 创建多线程方法二：实现Runnable接口
 * @ Date 2022/4/28 14:18
 * @ Created by 落尘
 */
public class demo02 {
    /*
        优缺点：
        优点:线程任务类只是实现接口，可以继续继承类和实现接口，扩展性强。
        缺点:编程多一层对象包装，如果线程有执行结果是不可以直接返回的。
     */
    public static void main(String[] args) {
        //创建一个任务对象
        Runnable target = new MyRunnable();

        //把任务对象交给Thread处理
        Thread t = new Thread(target);

        //启动线程
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主："+i);

        }

    }
}


// 定义一个线程任务类 实现Runnable接口
class MyRunnable implements Runnable{
    //重写run方法
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子："+i);
        }
    }
}