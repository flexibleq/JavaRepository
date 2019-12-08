package com.generic.genericmethod;
/*
//不使用泛型类
public class Generic {
    public void show(String s){
        System.out.println(s);
    }

    public void show(int i){
        System.out.println(i);
    }

    public void show(boolean b){
        System.out.println(b);
    }
}
*/

/*//使用泛型类
public class Generic <T>{
    public void show(T t){
        System.out.println(t);
    }
}*/

//使用泛型方法
public class Generic{
    public <T> void show(T t){
        System.out.println(t);
    }
}
