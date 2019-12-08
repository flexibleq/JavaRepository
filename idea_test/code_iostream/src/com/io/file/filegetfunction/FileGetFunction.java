package com.io.file.filegetfunction;

import java.io.File;

/*
* File类的判断和获取功能：
* public boolean isDirectory():测试此抽象路径名表示的File是否为目录
* public boolean isFile():测试此抽象路径名表示的File是否为文件
* public boolean exists():测试此抽象路径名表示的File是否存在
*
*public String getAbsolutePath():返回此抽象路径名的绝对路径名字符串
* public String getPath():将此抽象路径名转换为路径名字符串
* public String getName():返回由此抽象路径名表示的文件或目录的名称
*
* public String[] list():返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
* public File[] listFiles():返回此抽象路径名表示的目录中的文件和目录的File对象数组
*
*
* */
public class FileGetFunction {
    public static void main(String[] args) {
        //创建一个File对象
        File f = new File("F:\\iostream\\java.txt");
//      public boolean isDirectory():测试此抽象路径名表示的File是否为目录
//      public boolean isFile():测试此抽象路径名表示的File是否为文件
//      public boolean exists():测试此抽象路径名表示的File是否存在
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.exists());

//        public String getAbsolutePath():返回此抽象路径名的绝对路径名字符串
//        public String getPath():将此抽象路径名转换为路径名字符串
//        public String getName():返回由此抽象路径名表示的文件或目录的名称
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getPath());
        System.out.println(f.getName());
        System.out.println("----------------");
//        public String[] list():返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
//         public File[] listFiles():返回此抽象路径名表示的目录中的文件和目录的File对象数组
            File f2 = new File("F:\\iostream");
        String[] strArr = f2.list();
        for(String s:strArr){
            System.out.println(s);
        }
        System.out.println("----------------");

        File[] fileArray = f2.listFiles();
        for(File f3:fileArray){
            System.out.println(f3);
            if(f3.isFile()) {
                System.out.println(f3.getName());
            }
        }
    }
}
