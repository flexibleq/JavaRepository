package tcppractice5;

import java.io.*;
import java.net.Socket;
@SuppressWarnings("all")
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        Socket s = new Socket("192.168.29.67",10000);
        //创建字符输入流
        BufferedReader br = new BufferedReader(new FileReader("code_net\\s.txt"));
        //创建字符输出流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.shutdownOutput();
        //接收服务器的反馈
        BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String ss = brClient.readLine();
        System.out.println("服务器的反馈："+ss);
        //释放资源
        br.close();
        s.close();
    }
}
