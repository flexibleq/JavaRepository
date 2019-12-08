package inet.inetdemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
* InetAddress:
* 此类表示Internet协议(IP)地址
* public static InetAddress getByName(String host):确定主机名称的IP地址，主机名称可以是机器名称，也可以是IP地址
* public String getHostName():获取此IP地址的主机名
*public String getHostAddress():返回文本显示中的IP地址字符串
* */
public class InetMethodDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("LAPTOP-3NFJDUPG");
        String hostName = address.getHostName();
        String IP = address.getHostAddress();
        System.out.println("主机名："+hostName);
        System.out.println("IP地址："+IP);
    }
}
