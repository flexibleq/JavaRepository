package tcppractice2;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        Socket s = new Socket("192.168.29.67",10000);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while((line = br.readLine()) != null){
            if("886".equals(line)){
                break;
            }
            //
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //释放资源
        s.close();
    }
}
