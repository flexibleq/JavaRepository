package com.StudentManaged;

public class Student {
    private String sid;
    private String name;
    private String  age;
    private String address;


    public Student(){}

    public Student(String sid,String name,String age,String address){
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void setSid(String sid){
        this.sid = sid;
    }
    public String getSid(){
        return sid;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(String age){
        this.age = age;
    }

    public String getAge(){
        return age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }



}
