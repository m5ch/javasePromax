package d3_tcp.demo03;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @ Classname ServerReadRunnable
 * @ Description TODO 使用线程池，优化导入
 * @ Date 2022/5/2 17:16
 * @ Created by 落尘
 */
public class ServerReadRunnable implements Runnable{
    private Socket socket;
    public ServerReadRunnable(Socket socket) {
        this.socket = socket;
    }
    /*
        优势：
        服务端可以复用线程处理多个客户端，可以避免系统瘫痪。
        适合客户端通信时长较短的场景。
     */
    @Override
    public void run() {
        try {
            //3.输入流
            InputStream is = socket.getInputStream();
            //包装
            BufferedReader bf = new BufferedReader(new InputStreamReader(is));

            //4.读取输出
            String msg;
            while((msg = bf.readLine()) != null){
                System.out.println(socket.getRemoteSocketAddress() +
                        "发来的：" + msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
