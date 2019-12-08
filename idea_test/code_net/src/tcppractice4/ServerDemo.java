package tcppractice4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器Socket对象
        ServerSocket ss = new ServerSocket(10000);
        //监听客户端，返回一个Socket对象
        Socket s = ss.accept();
        //创建字符输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //创建字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("code_net\\ss.txt"));
        String line;
        while((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //释放资源
        bw.close();
        ss.close();
    }
}
