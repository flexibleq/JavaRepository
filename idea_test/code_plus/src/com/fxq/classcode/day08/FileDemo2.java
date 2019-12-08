package com.fxq.classcode.day08;

import java.io.File;
import java.util.Scanner;

public class FileDemo2 {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件夹路径：");
        while(true){
            String path = sc.nextLine();
            //创建File 对象
            File f = new File(path);
            //判断路径是否存在
            if(!f.exists()){
                System.out.println("您输入的路径不存在，请重新输入：");
            }else if(f.isFile()){  //判断该路径是文件还是文件夹
                System.out.println("您输入的路径为文件路径，请输入一个文件夹路径：");
            }else{
                //说明该路径为文件夹路径
                File[] files = f.listFiles();
                for(File file : files){
                    System.out.println(file.getName());
                }
                break;
            }

        }
    }
}
