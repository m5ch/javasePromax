package d3_tcp.demo03;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

/**
 * @ Classname Server
 * @ Description TODO 使用线程池，优化导入
 * @ Date 2022/5/2 16:02
 * @ Created by 落尘
 */
public class Server {
    //使用静态变量记录一个线程池对象
    private static ExecutorService pool = new ThreadPoolExecutor(3,5,5, TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) {
        try {
            System.out.println("服务端启动");
            //1.创建
            ServerSocket ss = new ServerSocket(9999);

            while (true) {
                //2.接收
                Socket socket = ss.accept();
                System.out.println(socket.getRemoteSocketAddress()+"来了老弟！");

                Runnable target = new ServerReadRunnable(socket);
                pool.execute(target);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
