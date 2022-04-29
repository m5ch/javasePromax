package synchronize.method;

/**
 * @ Classname DrawThread
 * @ Description TODO 取钱的线程类
 * @ Date 2022/4/28 16:49
 * @ Created by 落尘
 */
public class DrawThread extends Thread{
    //接受处理的账户对象
    private Account acc;
    public DrawThread(Account acc, String name){
        super(name);
        this.acc = acc;
    }
    @Override
    public void run() {
        acc.DrawMoney(10000);
    }
}
