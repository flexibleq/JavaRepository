package com.fxq.classcode.day09;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayToFile {
    public static void main(String[] args) throws IOException {
        //创建集合对象
        ArrayList<String> array = new ArrayList<String>();
        //添加元素
        array.add("hello");
        array.add("world");
        array.add("java");
        //创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("code_plus\\c1.txt"));
        //遍历集合
        for(String s:array){
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        //释放资源
        bw.close();
    }
}
