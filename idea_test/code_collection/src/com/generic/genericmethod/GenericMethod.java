package com.generic.genericmethod;

public class GenericMethod {
    public static void main(String[] args) {
       /* //创建对象,不使用泛型类
        Generic g = new Generic();
        g.show("hello");
        g.show(100);
        g.show(true);
        g.show('I');错误
*/
       /*//创建对象，使用泛型类
        Generic<String> gs = new Generic<String>();
        gs.show("hello");

        Generic<Integer> gi = new Generic<Integer>();
        gi.show(100);

        Generic<Boolean> gb = new Generic<Boolean>();
        gb.show(true);

        Generic<Character> gc = new Generic<Character>();
        gc.show('I');*/

        //创建对象，使用泛型方法
        Generic g = new Generic();
        g.show("hello");
        g.show(100);
        g.show(true);
        g.show('I');
    }



}
