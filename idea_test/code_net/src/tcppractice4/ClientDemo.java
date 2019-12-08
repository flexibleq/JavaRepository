package tcppractice4;

import java.io.*;
import java.net.Socket;

/*
* 客户端：数据来自于文本文件
* 服务器：接收到的数据写入文本文件
* */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
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

        //释放资源
        br.close();
        s.close();
    }
}
