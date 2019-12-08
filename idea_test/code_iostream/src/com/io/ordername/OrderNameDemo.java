package com.io.ordername;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*
* 需求：有一个文件里存储了班级同学的姓名，每一个名字占一行，要求通过程序实现随机点名器
* 思路：
* 1.创建字符缓冲输入流对象
* 2.创建ArrayList集合对象
* 3.调用字符缓冲输入流对象的方法读数据
* 4.把读取到的字符串数据存储到集合中
* 5.释放资源
* 6.使用Random产生一个随机数，随机数的范围在[0,集合的长度）
* 7.把产生的随机数作为索引到ArrayList集合中获取值
* 8.把得到的数据输出到控制台
* */
public class OrderNameDemo {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("code_iostream\\names.txt"));
        //创建集合对象
        ArrayList<String> array = new ArrayList<String>();
        //读取数据
        String line;
        while((line = br.readLine()) != null){
            array.add(line);
        }
        //释放资源
        br.close();
        //使用Random产生一个随机数，随机数的范围在[0,集合的长度)
        Random r = new Random();
        int index = r.nextInt(array.size());
        //把产生的随机数作为索引到ArrayList集合中获取值
        String name = array.get(index);
        //把得到的数据输出到控制台
        System.out.println("伟大的Java开发工程师："+name);
    }
}