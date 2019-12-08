package com.standard;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(20);
        s1.setName("放假啦上帝就发");
        s1.show();

        Student s2 = new Student("sdjf;alsfla",34);
        s2.show();
    }
}
