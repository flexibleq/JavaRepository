package com.fxq.classcode.day12.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        Socket s = new Socket(InetAddress.getByName("192.168.29.75"),10000);
        //获取输出流对象
        OutputStream os = s.getOutputStream();
        //获取输入流对象，接受反馈
        InputStream is = s.getInputStream();
        //键盘录入
        Scanner sc = new Scanner(System.in);
        byte[] bys = new byte[1024];
        while(true){
            System.out.println("请输入信息：");
            String ss = sc.nextLine();
            os.write(ss.getBytes());
            int len = is.read(bys);
            System.out.println("张臭臭说："+new String(bys,0,len));
        }
    }
}
