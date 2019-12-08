package tcppractice2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*
* 客户端：数据来自于键盘录入，直到输入的数据为886，发送数据结束
* 服务器：接收到的数据在控制台输出
* */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器端Socket对象
        ServerSocket ss = new ServerSocket(10000);
        //监听客户端连接，返回一个Socket对象
        Socket s = ss.accept();
        //创建输入流对象
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }

        //释放资源
        ss.close();
    }
}
