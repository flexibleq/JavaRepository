package tcppractice6;

import java.io.*;
import java.net.Socket;
@SuppressWarnings("all")
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        /*//创建客户端Socket对象
        Socket s = new Socket("192.168.29.67",10000);
        //创建字符输入流对象
        BufferedReader br = new BufferedReader(new FileReader("code_net\\s.txt"));
        //创建字符输出流对象
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.shutdownOutput();
        //接收服务器反馈
        BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String sServer = brClient.readLine();
        System.out.println("服务器的反馈："+sServer);

        //释放资源
        br.close();
        s.close();*/

        //创建客户端Socket对象
        Socket s = new Socket("192.168.29.70",10000);
        //创建字符输入流对象
        BufferedReader br = new BufferedReader(new FileReader("code_net\\s.txt"));
        //创建字符输出流对象
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        //读写数据
        String line;
        while((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.shutdownOutput();
        //接收服务器反馈
        BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String message = brClient.readLine();
        System.out.println("服务器的反馈："+message);

        //释放资源
        br.close();
        s.close();

    }
}
