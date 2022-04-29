package threadPool;

import java.util.concurrent.Callable;


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
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return Thread.currentThread().getName() +
                ":1-"+n+"的结果是" + sum;
    }
}
