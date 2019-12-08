package com.fxq5;

public class Student extends Person{

    public Student(){}

    public Student(String name, String age) {
        super(name, age);
    }

//    public Student(String name,String age){
//        super(name,age);
//    }

    public void study(){
        System.out.println("用心做好每一件事");
    }
}
