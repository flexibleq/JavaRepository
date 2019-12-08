package com.fxq10;
//静态成员方法只能访问静态成员
public class StaticDemo {
    public String name;
    public static int age;

    public void show(){
        System.out.println(name);
        System.out.println(age);
        show1();
        show2();
    }

    public void show1(){

    }

    public static void show2(){
//        System.out.println(name);
        System.out.println(age);
//        show();
        show3();
    }

    public static void show3(){

    }
}
