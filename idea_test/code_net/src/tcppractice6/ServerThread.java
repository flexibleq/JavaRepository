package tcppractice6;

import java.io.*;
import java.net.Socket;

public class ServerThread implements  Runnable{
    private Socket s;
    public ServerThread(Socket s){
        this.s = s;
    }

    @Override
    public void run() {
        try {
            //获取当前毫秒值
            long time = System.currentTimeMillis();
            //创建字符输入流对象
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            //创建字符输出流对象
            BufferedWriter bw = new BufferedWriter(new FileWriter("code_net\\"+time+".txt"));
            //读写数据
            String line;
            while((line = br.readLine()) != null){
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

            //给出反馈
            BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bwServer.write("文件上传成功");
            bwServer.newLine();
            bwServer.flush();
            //释放资源
            bw.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*private Socket s ;

    public ServerThread(Socket s){
        this.s = s;
    }
    @Override
    public void run() {
        int count=0;
        //创建字符输入流对象
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//            BufferedWriter bw = new BufferedWriter(new FileWriter("code_net\\ssss.txt"));
            File f = new File("code_net\\ssss["+count+"].txt");
            while(f.exists()){
                count++;
                f = new File("code_net\\ssss["+count+"].txt");
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            String line;
            while((line = br.readLine()) != null){
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
            //给出反馈
            BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bwServer.write("文件上传成功");
            bwServer.newLine();
            bwServer.flush();

            //释放资源
            bw.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }*/
}
