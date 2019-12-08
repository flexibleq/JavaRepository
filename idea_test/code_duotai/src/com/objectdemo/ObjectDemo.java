package com.objectdemo;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("小黄");
        s1.setAge(30);
       // System.out.println(s);

        Student s2 = new Student();
        s2.setName("小黄");
        s2.setAge(30);

        System.out.println(s1.equals(s2));
    }
}
