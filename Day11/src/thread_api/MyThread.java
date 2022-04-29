package thread_api;

/**
 * @ Classname MyThread
 * @ Description TODO
 * @ Date 2022/4/28 16:03
 * @ Created by 落尘
 */
public class MyThread extends Thread{
    public MyThread() {
    }

    public MyThread(String name) {
        //为当前对象设置名称，送给父类的有参构造器初始化名称
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() +"子线程执行输出：" + i);
        }
    }
}
