package com.fxq.classcode.day12.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
@SuppressWarnings("all")
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //创建服务器端Socket对象
        ServerSocket ss = new ServerSocket(12321);
        //监听客户端
        Socket s = ss.accept();
        //获取输入流对象
        InputStream is = s.getInputStream();
        //获取输出流对象
        OutputStream os = s.getOutputStream();
        //键盘录入
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH点mm分ss秒");
        byte[] bys = new byte[1024];
        while(true){
            Date d = new Date();
            String time = sdf.format(d);
            int len = is.read(bys);
            System.out.println("张臭臭说："+new String(bys,0,len));

            System.out.println("请输入信息：");
            String s1 = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            sb.append(time).append("--->").append("张臭臭的爸爸说：").append(s1);
            os.write(sb.toString().getBytes());
        }
    }
}
