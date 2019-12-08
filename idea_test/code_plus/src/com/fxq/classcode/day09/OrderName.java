package com.fxq.classcode.day09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class OrderName {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("code_plus\\names.txt"));
        //创建集合对象
        ArrayList<String> array = new ArrayList<String>();
        //读取数据
        String line;
        while((line = br.readLine()) != null){
            array.add(line);
        }
        //创建随机数对象
        Random r = new Random();
        int index = r.nextInt(array.size());

        String name = array.get(index);
        System.out.println("幸运者是："+name);
    }
}
