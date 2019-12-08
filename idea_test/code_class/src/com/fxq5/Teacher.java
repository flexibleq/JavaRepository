package com.fxq5;

public class Teacher extends Person {

    public Teacher() {
    }

    public Teacher(String name, String age){
        super(name,age);
    }
    public void teach(){
        System.out.println("用爱成就每一位学员");
    }
}
