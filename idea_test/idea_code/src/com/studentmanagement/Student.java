package com.studentmanagement;

public class Student {
    private String name;
    private String age;
    private String sid;
    private String address;

    public Student(){}

    public Student(String sid,String name,String age,String address){
        this.name = name;
        this.age = age;
        this.sid = sid;
        this.address = address;
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

    public void setSid(String sid){
        this.sid = sid;
    }

    public String getSid(){
        return sid;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return address;
    }
}
