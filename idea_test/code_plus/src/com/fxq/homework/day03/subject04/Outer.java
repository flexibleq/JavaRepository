package com.fxq.homework.day03.subject04;

public class Outer {

    public  static A method(){
        //把A用Inter代替同理
        //方法一
       /* A a =  new A(){
            @Override
            public void show() {
                System.out.println("HelloWorld");
            }
        };
        return a;*/
        //方法二
      /*return  new A(){
           @Override
           public void show() {
              super.show();
           }
       };*/
      //方法三
      A a = new A();
      return a;
    }
}
