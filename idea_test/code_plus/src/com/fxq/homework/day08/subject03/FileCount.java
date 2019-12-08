package com.fxq.homework.day08.subject03;

import java.io.File;
import java.util.Scanner;

//(1)键盘录入一个文件夹路径
//	(2)定义一个方法统计该文件夹 中一共有多个文件
public class FileCount {
    private static int count =0;
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        //创建File对象
        File srcFile = null;
        System.out.println("请输入一个文件夹路径：");
        while(true){
            String path = sc.nextLine();
            srcFile = new File(path);
            if(!srcFile.exists()){
                System.out.println("输入的文件夹路径不存在，请重新输入：");
            }else if(srcFile.isFile()){
                System.out.println("请输入一个文件夹路径：");
            }else{
                break;
            }
        }

        int result = countFile(srcFile);
        System.out.println("在该文件夹下共有"+result+"个文件");
    }
    public static int  countFile(File file){
        File[] files = file.listFiles();
        if(files != null){
            for(File f:files){
                if(f.isFile()){
                    count++;
                }else{
                    countFile(f);
                }
            }
        }
        return count;
    }
}
