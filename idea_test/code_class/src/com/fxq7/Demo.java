package com.fxq7;
//final关键字修饰的方法不能被重写
//final关键字修饰的成员变量为常量，之后不能被修改
//final关键字修饰的类不能被继承
public class Demo {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.method();
        z.show();
    }
}
