package synchronize.code;

/**
 * @ Classname Test
 * @ Description TODO 线程同步一：同步代码块。锁对象 以及规范要求
 * @ Date 2022/4/28 19:04
 * @ Created by 落尘
 */
public class Test {
    /**
     * 规范上:建议使用共享资源作为锁对象。
     * 对于实例方法建议使用this作为锁对象。
     * 对于静态方法建议使用字节码(类名.class)对象作为锁对象。
     * @param args ..
     */
    public static void main(String[] args) {
        //定义线程类，创建一个共享的账户对象
        Account acc = new Account("张三",10000);

        //创建两个线程对象，代表两个人同时进来
        new DrawThread(acc,"小明").start();
        new DrawThread(acc,"小红").start();

    }
}
