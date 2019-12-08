package com.objectdemo;

public class Student {
    private String name;
    private int age;

    public Student(){}

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        //如果地址相同，直接返回true
        if (this == o) return true;
        //如果对象为空或者不在同一个类里直接返回false
        if (o == null || getClass() != o.getClass()) return false;
        //向下转型
        Student student = (Student) o;
        //如果名字不同返回false
        if (age != student.age) return false;
        //名字不为空->并且名字相等则返回true；
        return name != null ? name.equals(student.name) : student.name == null;
    }

}
