package com.fxq.homework.day10.subject02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

//模拟用户登录
//	1.手动创建一个 以 .properties结尾的文件,手动添加 用户名 和 密码的键值对数
//	2.把该文件中的数据加载到集合
//	3.然后再键盘录入一个用户名和密码
//		如果从properties文件中读到的数据和键盘录入的数据一样就提示登录成功
//		如果不一样,请分别提示 是用户名错误或者密码错误
public class LoginDemo {
    public static void main(String[] args) throws IOException {
        //创建集合对象
        Properties prop = new Properties();
        FileReader fr = new FileReader("F:\\userInfo.properties");
        prop.load(fr);
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();
        //比较
        Set<String> names = prop.stringPropertyNames();
        for(String userName:names){
            Object obj = prop.get(userName);
            String pwd = (String)obj;
            if(name.equals(userName) && pwd.equals(password)){
                System.out.println("登陆成功");
            }else if(!name.equals(userName)){
                System.out.println("用户名错误");
            }else{
                System.out.println("密码错误");
            }
        }
    }
}
