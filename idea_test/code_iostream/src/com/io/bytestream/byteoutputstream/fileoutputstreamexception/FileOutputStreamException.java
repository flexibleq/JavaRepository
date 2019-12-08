package com.io.bytestream.byteoutputstream.fileoutputstreamexception;

import java.io.FileOutputStream;
import java.io.IOException;

/*
* 字节流写数据加入异常处理
* */
public class FileOutputStreamException {
    public static void main(String[] args) {
        //加入finally来释放资源
        FileOutputStream fos = null;
        try {
        fos = new FileOutputStream("code_iostream\\测试.txt");
        fos.write("天行健君子以自强不息".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
