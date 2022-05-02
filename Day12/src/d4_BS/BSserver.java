package d4_BS;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

/**
 * @ Classname BSserver
 * @ Description TODO 模拟BS框架
 * @ Date 2022/5/2 20:54
 * @ Created by 落尘
 */
public class BSserver {
    //使用静态变量记录一个线程池对象
    private static ExecutorService pool = new ThreadPoolExecutor(3,5,5, TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) {
        try {
            //1.注册端口
            ServerSocket ss = new ServerSocket(8080);

            //2.创建循环接收客户端的请求
            while (true){
                Socket socket = ss.accept();

                pool.execute(new ServerReadRunnable(socket));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
