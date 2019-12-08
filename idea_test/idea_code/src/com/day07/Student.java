package com.day07;

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0 || age>120){
            System.out.println("你给的年龄有误！");
        }else{
            this.age = age;
        }

    }

    public void show(){
        System.out.println(name + "-----" + age);
    }
}
