package com.innerclass.inner_class.ele_inner_class;

public class OuterDemo {
    public static void main(String[] args) {
       // Inner i = new Inner();
       /* 内部类访问修饰符为public
        Outer.Inner oi = new Outer().new Inner();
        oi.show();*/

       //内部类访问修饰符为private
        Outer o = new Outer();
        o.method();
    }
}
