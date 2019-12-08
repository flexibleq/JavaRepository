package com.fxq.classcode.day13;

public class Test3 {
    public static void main(String[] args) {
        //lambda表达式
        useMyString((s,x,y)->s.substring(x,y));

        //引用类的实例方法
        useMyString(String::substring);
    }
    public static void useMyString(MyString ms){
        String result = ms.mySubString("helloworld", 2, 5);
        System.out.println(result);
    }
}
