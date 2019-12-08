package com.fxq4;

public class Outer {
    private int num = 10;

    public void method(){
        int num1 = 20;
        class Inner{
            public void show(){
                System.out.println(num);
                System.out.println(num1);
            }
        }
        Inner i = new Inner();
        i.show();
    }
}
