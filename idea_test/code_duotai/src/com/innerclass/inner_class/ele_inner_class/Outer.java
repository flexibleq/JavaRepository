package com.innerclass.inner_class.ele_inner_class;

public class Outer {
    public int a = 2;
    private int b = 3;

    /*public class Inner{
        public void show(){
            System.out.println(a);
            System.out.println(b);
        }
    }*/

    private class Inner{
        public void show(){
            System.out.println(a);
            System.out.println(b);
        }
    }

    public void method(){
        Inner i = new Inner();
        i.show();
    }


}
