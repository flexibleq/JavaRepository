package tcppractice;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
* 客户端：发送数据，接收服务器反馈
* 服务器：接收数据，给出反馈
* */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        Socket s = new Socket("192.168.29.67",10000);
        //获取OutputStream对象
        OutputStream os = s.getOutputStream();
        os.write("hello,tcp,老子来了".getBytes());
        //接受反馈
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        System.out.println("客户端："+new String(bys,0,len));
        //释放资源
        s.close();
    }
}
