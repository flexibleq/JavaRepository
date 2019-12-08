package com.fxq.classcode.day09;

import java.io.*;

public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
        //根据数据源创建字节缓冲输入流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\iostream\\audio\\001_继承.avi"));
        //根据目的地创建字节缓冲输出流对象
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("code_plus\\001_继承.avi"));
        //读写数据，复制视频
        byte[] bys = new byte[1024];
        int len;
        while((len = bis.read(bys)) != -1){
            bos.write(bys,0,len);
        }
        //释放资源
        bis.close();
        bos.close();
    }
}
