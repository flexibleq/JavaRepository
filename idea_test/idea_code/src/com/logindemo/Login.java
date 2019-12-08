package com.logindemo;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String username = "fxq";
        String password = "123456";
        for(int i=0;i<3;i++){
            Scanner sc = new Scanner(System.in);

            System.out.println("请输入用户名：");
            String name = sc.nextLine();

            System.out.println("请输入密码：");
            String pwd = sc.nextLine();

            if(name.equals(username) && pwd.equals(password)){
                System.out.println("登陆成功");
                break;
            }else{
                System.out.println("登陆失败，你还有"+(2-i)+"次机会");
            }
        }


    }
}
