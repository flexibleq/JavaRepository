package com.fxq.classcode.day01;

public class PersonDemo {
    public static void main(String[] args) {
        Teacher t = new Teacher("张三丰",100);
        System.out.println(t.getName()+","+t.getAge());
        t.teach();
        Student s = new Student("张翠山",45);
        System.out.println(s.getName()+","+s.getAge());
        s.study();
    }
}
