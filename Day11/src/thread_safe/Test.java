package thread_safe;

/**
 * @ Classname Test
 * @ Description TODO 模拟线程安全问题
 * @ Date 2022/4/28 16:43
 * @ Created by 落尘
 */
public class Test {
    public static void main(String[] args) {
        //定义线程类，创建一个共享的账户对象
        Account acc = new Account("张三",10000);

        //创建两个线程对象，代表两个人同时进来
        new DrawThread(acc,"小明").start();
        new DrawThread(acc,"小红").start();
    }
}
