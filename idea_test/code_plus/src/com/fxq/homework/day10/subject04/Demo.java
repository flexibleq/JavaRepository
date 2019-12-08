package com.fxq.homework.day10.subject04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

// 我有一个文本文件score.txt，我知道数据是键值对形式的，但是不知道内容是什么。
//请写一个程序判断是否有"lisi"这样的键存在，如果有就改变其实为"100"
//score.txt文件内容如下：
//zhangsan=90
//lisi=80
//wangwu=85
public class Demo {
    public static void main(String[] args) throws IOException {
        //创建Properties集合
        Properties prop = new Properties();
        //创建字符缓冲输入流
        FileReader fr = new FileReader("code_plus\\score.txt");
        prop.load(fr);
        //获取键集合
        Set<String> names = prop.stringPropertyNames();
        for(String name:names){
            if("lisi".equals(name)){
                prop.setProperty(name,"100");
            }
        }
        //创建字符缓冲输出流对象
        FileWriter fw = new FileWriter("code_plus\\score.txt");
        prop.store(fw,null);
        fr.close();
        fw.close();
    }
}
