package d3_tcp.demo04;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * @ Classname Server
 * @ Description TODO
 * @ Date 2022/5/2 19:49
 * @ Created by 落尘
 */
public class Server {
    //定义一个  静态的List集合用来存储当前全部在线的管道
    public static List<Socket> AllOnlineSockets = new ArrayList<>();

    public static void main(String[] args) {
        try {
            System.out.println("服务端启动~~~");
            //1.
            ServerSocket ss = new ServerSocket(9999);

            while (true) {
                //2.
                Socket socket = ss.accept();
                System.out.println(socket.getRemoteSocketAddress()+"来了老弟！");
                //上线
                AllOnlineSockets.add(socket);
                
                //创建一个独立的线程单独处理这个管道
                new ServerReadThread(socket).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ServerReadThread extends Thread{
    private Socket socket;
    public ServerReadThread(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            //3.输入流
            InputStream is = socket.getInputStream();
            //
            BufferedReader bf = new BufferedReader(new InputStreamReader(is));

            //
            String msg;
            while((msg = bf.readLine()) != null){
                System.out.println("收到"+socket.getRemoteSocketAddress()+
                        "发来的:" + msg);
                sendmsgToAll(msg);
            }

        } catch (Exception e) {
            System.out.println(socket.getRemoteSocketAddress()+
                    "下线了~");
            Server.AllOnlineSockets.remove(socket);
        }

    }

    private void sendmsgToAll(String msg) throws Exception {
        for (Socket socket : Server.AllOnlineSockets) {
            PrintStream ps = new PrintStream(socket.getOutputStream());
            ps.println(msg);
            ps.flush();
        }
    }
}


