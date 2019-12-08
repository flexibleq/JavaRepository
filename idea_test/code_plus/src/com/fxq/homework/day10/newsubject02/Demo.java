package com.fxq.homework.day10.newsubject02;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Properties;

//
//	已知某文件的数据为如下内容
//		故人西辞富士康
//		为学技术去蓝翔
//		蓝翔学完包分配
//		尼玛还是富士康
//	要求通过代码更改此文件的内容,结果如下
//		尼玛还是富士康
//		蓝翔学完包分配
//		为学技术去蓝翔
//		故人西辞富士康
//
public class Demo {
    public static void main(String[] args) throws IOException {
       //创建ArrayList集合
        ArrayList<String> array = new ArrayList<String>();
        //创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("code_plus\\newSubject02.txt"));
        String line;
        while((line = br.readLine()) != null){
            array.add(line);
        }
        br.close();
        Collections.reverse(array);
        //创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("code_plus\\newSubject02.txt"));
        //遍历集合
        for(String s:array){
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
