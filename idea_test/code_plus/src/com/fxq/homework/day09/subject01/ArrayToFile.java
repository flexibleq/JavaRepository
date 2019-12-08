package com.fxq.homework.day09.subject01;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

//键盘输入n个int类型数据,将每一个int类型的数据存储到集合
//	注意:当用户输入：”886”时，停止输入。
//	最后将集合里的数据写入到文件,且保证数据能够看得懂
//	例如输入的数据为:44 11 22 33, 那么最后文件中的数据格式为:
//	11
//	22
//	33
//	44
public class ArrayToFile {
    public static void main(String[] args) throws IOException{
        //键盘录入
        Scanner sc = new Scanner(System.in);
        //创建集合对象
        ArrayList<Integer> array = new ArrayList<Integer>();

        System.out.println("请输入一个整数：");
        while(true){
            int number = sc.nextInt();
            if(number == 886){
                break;
            }else{
                array.add(number);
                System.out.println("请输入一个整数：");
            }
        }
        Collections.sort(array);
        System.out.println(array);
        //创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("code_plus\\number.txt"));
       // OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("code_plus\\number.txt"));
        //遍历集合
        for(Integer i:array){
            String s = String.valueOf(i);
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
       //释放资源
       bw.close();
    }
}
