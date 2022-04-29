package thread_api;

/**
 * @ Classname demo01
 * @ Description TODO 线程的API
 * @ Date 2022/4/28 15:59
 * @ Created by 落尘
 */
public class demo01 {
    public static void main(String[] args) {
        Thread t1 = new MyThread("1号");

        t1.start();
        System.out.println(t1.getId());
        System.out.println(t1.getName());


        Thread t2 = new MyThread();

        t2.setName("2号");
        t2.start();
        System.out.println(t2.getId());
        System.out.println(t2.getName());


        //那个对象执行它，它就得到哪个线程对象
        Thread m = Thread.currentThread();
        System.out.println(m.getName());
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行输出："+i);
        }
    }
}
