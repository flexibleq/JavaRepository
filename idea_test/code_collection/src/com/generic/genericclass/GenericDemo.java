package com.generic.genericclass;

public class GenericDemo {
    public static void main(String[] args) {
        //不使用泛型类
        //创建学生对象
        Student s = new Student();
        s.setName("杨过");
        System.out.println(s.getName());

        Teacher t = new Teacher();
        t.setName("欧阳锋");
        System.out.println(t.getName());

        //使用泛型类
        Generic<String> gs = new Generic<String>();
        gs.setT("hello");
        System.out.println(gs.getT());

        Generic<Integer> gi = new Generic<Integer>();
        gi.setT(100);
        System.out.println(gi.getT());

        Generic<Boolean> gb = new Generic<Boolean>();
        gb.setT(true);
        System.out.println(gb.getT());


    }
}
