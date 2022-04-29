package thread;

/**
 * @ Classname demo01
 * @ Description TODO 多线程的创造方式一： 继承Threa类实现
 * @ Date 2022/4/28 13:59
 * @ Created by 落尘
 */
public class demo01 {
    /*
        优缺点：
        优点:编码简单
        缺点:线程类已经继承Thread，无法继承其他类，不利于扩展。
     */
    public static void main(String[] args) {

        /*
            3.new一个新线程对象
         */
        Thread t = new Mythread();

        /*
            4.调用start方法启动线程（执行的还是run方法）
         */
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行输出："+i);

        }
    }
}


/*
    1.定义一个线程类继承Threa类
 */
class Mythread extends Thread{
    /*
        重写run方法
     */

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程执行输出："+i);
        }
    }

}