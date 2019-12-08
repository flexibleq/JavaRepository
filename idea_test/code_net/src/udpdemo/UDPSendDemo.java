package udpdemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
* UDP发送数据的步骤：
* 1.创建发送端的Socket对象（DatagramSocket）
* 2.创建数据，并把数据打包
* 3.调用DatagramSocket对象的方法发送数据
* 4.关闭发送端
* */
public class UDPSendDemo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        //创建发送端的Socket对象（DatagramSocket）
        //DatagramSocket():构造数据报套接字并将其绑定到本地主机上的任何可用端口
        DatagramSocket ds = new DatagramSocket();
        //创建数据，并把数据打包
        while(true) {
            System.out.println("请输入信息：");
            Date d = new Date();
            String date = sdf.format(d);
            String s = sc.nextLine();
           StringBuilder sb = new StringBuilder();
           sb.append(date).append("----->").append(s);
            //DatagramPacket(byte[] buf,int length,InetAddress address,int port)
            //构造一个数据包，发送长度为length的数据包到指定主机上的指定端口号
            byte[] bys = sb.toString().getBytes();
            int length = bys.length;
            InetAddress address = InetAddress.getByName("192.168.29.67");
            int port = 10089;
            DatagramPacket dp = new DatagramPacket(bys, length, address, port);
            //DatagramPacket dp = new DatagramPacket(bys,bys.length,InetAddress.getByName("192.168.29.67"),10089);
            //调用DatagramSocket对象的方法发送数据
            //void send(DatagramPacket p):以此套接字发送数据报包
            ds.send(dp);
            //关闭发送端
            // ds.close();
        }
    }
}
