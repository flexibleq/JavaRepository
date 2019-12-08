package com.fxq.classcode.day13;

public class PrintDemo {
    public static void main(String[] args) {
        //lambda表达式
        usePrintUpper(s-> System.out.println(s.toUpperCase()));

        //方法引用
        PrintString ps = new PrintString();
        usePrintUpper(ps::print);
    }



    public static void usePrintUpper(PrintUpper p){
        p.printUpperCase("10086");
    }
}
