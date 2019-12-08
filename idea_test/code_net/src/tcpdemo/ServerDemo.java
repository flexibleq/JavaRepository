package tcpdemo;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
* 接收数据的步骤
* 1.创建服务器端的Socket对象(ServerSocket)
* ServerSocket(int port)
* 2.监听客户端连接，返回一个Socket对象
* Socket accept();
* 3.获取输入流，读数据，并把数据显示在控制台
* InputStream getInputStream()
* 4.释放资源
* void close();
*
* */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器端的Socket对象
        ServerSocket ss = new ServerSocket(10000);
        //监听客户端连接，返回一个Socket对象
        Socket s = ss.accept();
        //获取输入流，读数据，并把数据显示在控制台
        //InputStream getInputStream()
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len;
        while((len = is.read(bys)) != -1){
            System.out.println(new String(bys,0,len));
        }
        //释放资源
        ss.close();
        s.close();

    }
}
