package com.fxq.classcode.day13;

public class Test2 {
    public static void main(String[] args) {
        //lambda表达式
        useConvertable(s->Integer.parseInt(s));

        //方法引用
        useConvertable(Integer::parseInt);

        useConvertable(Test2::f);
    }

    public static int f(String s){
        int i = Integer.parseInt(s);
        return i + 100;
    }

    public static void useConvertable(Convertable c){
        int i = c.convert("12345");
        System.out.println(i);
    }
}
