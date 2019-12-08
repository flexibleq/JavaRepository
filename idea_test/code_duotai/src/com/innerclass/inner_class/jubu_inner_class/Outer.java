package com.innerclass.inner_class.jubu_inner_class;

public class Outer {
    public int a = 2;
    private int b = 3;
    public void method(){
        int c = 4;
        class Inner{
            public void show(){
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            }
        }
        Inner i = new Inner();
        i.show();
    }
}
