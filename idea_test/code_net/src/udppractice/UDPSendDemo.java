package udppractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//UDP发送数据：
//数据来自于键盘录入，直到输入的数据是886，发送数据结束
public class UDPSendDemo {
    public static void main(String[] args) throws IOException{
        //创建发送端DatagramSocket对象
        DatagramSocket ds = new DatagramSocket();
        //创建字符缓冲输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = br.readLine()) != null){
            //输入的数据是886，发送数据结束
            if("886".equals(line)){
                break;
            }
            byte[] bys = line.getBytes();
            //创建数据包
            DatagramPacket dp = new DatagramPacket(bys,bys.length, InetAddress.getByName("192.168.29.67"),12345);
            //调用发送端的方法发送数据
            ds.send(dp);

        }
        //关闭发送端
        ds.close();
    }
}
