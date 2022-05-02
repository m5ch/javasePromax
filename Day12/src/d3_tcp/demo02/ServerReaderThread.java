package d3_tcp.demo02;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @ Classname ServerReaderThread
 * @ Description TODO
 * @ Date 2022/5/2 15:27
 * @ Created by 落尘
 */
public class ServerReaderThread extends Thread{
    private Socket socket;
    public ServerReaderThread(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //3.从Socket通信管道中得到一个字节输入流
            InputStream is = socket.getInputStream();
            //包装(缓冲字符输入流)
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            //4.按照行读取消息
            String line;
            if ((line = br.readLine()) != null){
                System.out.println(socket.getRemoteSocketAddress() +"发来的:" +line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
