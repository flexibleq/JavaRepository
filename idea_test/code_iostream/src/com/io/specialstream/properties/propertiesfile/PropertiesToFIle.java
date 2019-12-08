package com.io.specialstream.properties.propertiesfile;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
* Properties和IO流结合的方法
* void load(Reader reader):
* 从输入字符流读取属性列表（键和元素对）
* void store(Writer writer,String comments):
* 将此属性列表（键和元素对）写入此Properties表中，以适合使用load(Reader)方法的格式写入输出字符串
* */
public class PropertiesToFIle {
    public static void main(String[] args) throws IOException {
        myStore();
        myLoad();
    }

    public static void myLoad() throws IOException{
        //创建集合对象
        Properties prop = new Properties();
        FileReader fr = new FileReader("code_iostream\\fww.txt");
        prop.load(fr);
        fr.close();
        System.out.println(prop);

    }
    public static void myStore() throws IOException{
        //创建集合对象
        Properties prop = new Properties();
        prop.setProperty("张三丰","100");
        prop.setProperty("张翠山","45");
        prop.setProperty("张无忌","24");
        //创建字符输出流对象
        FileWriter fw = new FileWriter("code_iostream\\fww.txt");
        prop.store(fw,null);
        fw.close();
    }
}
