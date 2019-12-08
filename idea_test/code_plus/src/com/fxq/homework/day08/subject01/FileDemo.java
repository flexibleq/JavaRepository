package com.fxq.homework.day08.subject01;


import java.io.File;
import java.util.Scanner;

//键盘录入一个文件夹路径
//对键盘录入的文件夹路径进行判断
//如果不存在,提示重新录入
//如果是文件路径,提示再次录入文件夹录入
//如果是文件夹路径,搜索该文件下所有 以.txt结尾的文件（包含子目录中的文件）
public class FileDemo {
    public static void main(String[] args) {
//        键盘录入一个文件夹路径
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件夹路径：");
        while(true){
            String path = sc.nextLine();
            File srcFile = new File(path);
            if(srcFile.exists()){
                if(srcFile.isFile()){
                    System.out.println("请输入文件夹路径：");
                }else{
                    getAllFileName(srcFile);
                    break;
                }
            }else{
                System.out.println("路径不存在，请重新输入：");
            }
        }
    }
    public static void getAllFileName(File f){
        File[] files = f.listFiles();
        if(files != null){
            for(File file:files){
                if(file.isDirectory()){
                    getAllFileName(file);
                }else if(file.getName().endsWith(".txt")) {
                    System.out.println(file.getName());
                }
            }
        }
    }
}
