package com.fxq.classcode.day08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo1 {
    public static void main(String[] args) throws IOException {
        //根据数据源创建字节输入流对象
        FileInputStream fis = new FileInputStream("code_plus\\小蜜蜂.txt");
        //根据目的地创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("code_plus\\张臭臭.txt");

        //读写数据
        int by;
        while((by = fis.read()) != -1){
            fos.write(by);
        }
        fis.close();
        fos.close();
    }
}
