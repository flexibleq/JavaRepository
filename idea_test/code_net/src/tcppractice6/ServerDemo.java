package tcppractice6;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        /*//创建服务器Socket对象
        ServerSocket ss= new ServerSocket(10000);
        //监听客户端，返回一个对应的Socket对象
        while(true) {
            Socket s = ss.accept();
            new Thread(new ServerThread(s)).start();
        }*/

        //创建服务器Socket对象
        ServerSocket ss = new ServerSocket(10000);
        while(true) {
            //监听客户端
            Socket s = ss.accept();
            new Thread(new ServerThread(s)).start();
        }
    }
}
