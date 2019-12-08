package com.innerclass.inner_class;
//内部类可以直接访问外部类的成员，包括私有的
//外部类要访问内部类的成员，必须创建对象
public class Outer {
    public int a = 2;
    private int b = 3;


    public class Inner{
        public void show(){
            System.out.println(a);
            System.out.println(b);
        }
    }

    public void show(){
        Inner i = new Inner();
        i.show();
    }
}
