package udppractice;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiveDemo {
    public static void main(String[] args) throws IOException {
        //创建接收端DatagramSocket对象
        DatagramSocket ds = new DatagramSocket(12345);
        while(true) {
            //创建数据包
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);
            //接受数据
            ds.receive(dp);
            //解析数据
            System.out.println("数据是："+new String(dp.getData(), 0, dp.getLength()));
        }
        //关闭接收端
       // ds.close();
    }
}
