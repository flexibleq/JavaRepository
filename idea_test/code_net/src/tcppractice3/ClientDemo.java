package tcppractice3;

import java.io.*;
import java.net.Socket;

/*
* 客户端：数据来自于键盘录入，直到输入的数据是886，发送数据结束
* 服务器：接收到的数据写入文本文件
* */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        Socket s = new Socket("192.168.29.67",10000);
        //创建输入流对象
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //创建输出流对象
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        //读取键盘录入的数据
        String line;
        while((line = br.readLine()) != null){
            //如果键盘输入886，就停止录入
            if("886".equals(line)){
                break;
            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //释放对象
        br.close();
        s.close();
    }
}
