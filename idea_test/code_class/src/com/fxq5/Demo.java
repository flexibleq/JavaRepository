package com.fxq5;

public class Demo {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setAge("30");
        t.setName("风清扬");
        System.out.println(t.getName()+","+t.getAge());
        t.teach();

        Teacher t1 = new Teacher("杨过","34");
        System.out.println(t1.getName()+","+t1.getAge());
        t1.teach();

        Student s = new Student();
        s.setName("郭靖");
        s.setAge("19");
        System.out.println(s.getName()+","+s.getAge());
        s.study();

        Student s1 = new Student("黄蓉","18");
        System.out.println(s1.getName()+","+s1.getAge());
        s1.study();
    }
}
