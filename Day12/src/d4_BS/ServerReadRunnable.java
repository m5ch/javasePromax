package d4_BS;

import java.io.PrintStream;
import java.net.Socket;

/**
 * @ Classname ServerReadRunnable
 * @ Description TODO 使用线程池，优化导入
 * @ Date 2022/5/2 21:14
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
        try{
            //浏览器 已经与本线程建立了Socket管道
            //消息响应给浏览器显示
            PrintStream ps = new PrintStream(socket.getOutputStream());

            //必须响应HTTP协议格式数据，否则浏览器不认识消息
            ps.println("HTTP:/1.1 200 OK");     //协议类型和版本 响应成功的消息
            ps.println("Content-Type:text/html;charset=UTF-8");     //相应的数据类型；文本、网页
            ps.println();   //必须发送一个空行
            //才可以响应数据回给浏览器
            ps.println("<span style = 'color: blue;font-size: 120px;'> 黑马牛逼！！！<span>");
            ps.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
