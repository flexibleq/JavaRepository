package com.fxq.classcode.day01;

public class Student extends Person{
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public void study(){
        System.out.println("认真学习");
    }

}
