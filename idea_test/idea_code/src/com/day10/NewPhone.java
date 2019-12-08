package com.day10;

public class NewPhone extends Phone {
    public void call(String name){
        System.out.println("开启视频功能");
        //.out.println("给"+name+"打电话");
        super.call(name);
    }
}
