package com.demo;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name + "," + s.age);

        s.name = "李逍遥";
        s.age = 30;
        System.out.println(s.name + "," + s.age);

        s.study();
        s.doHomework();

        Student s1 = s;
        s1.name = "杨过";
        s1.age = 32;

        System.out.println(s1.name + "," + s1.age);
        s1.study();
        s1.doHomework();
    }
}
