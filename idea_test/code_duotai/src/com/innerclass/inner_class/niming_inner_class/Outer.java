package com.innerclass.inner_class.niming_inner_class;

public class Outer {

    public void method(){
       /* 匿名内部类
       new Inter(){
            @Override
            public void inter() {
                System.out.println("匿名内部类");
            }
        }.inter();*/

       Inter i = new Inter(){
           @Override
           public void inter() {
               System.out.println("匿名内部类");
           }
       };
       i.inter();
       i.inter();
       i.inter();
    }
}
