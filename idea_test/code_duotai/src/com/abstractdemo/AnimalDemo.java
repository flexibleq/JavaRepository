package com.abstractdemo;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.eat();
        int e = 8;
        int f = 3;
        int g = 5;

        byte h = 23;
        short j = 137;
        short k = (short)(h+j);
        System.out.println(k);
        if(e>f){
            if(e>g){
                System.out.println(e);
            }else{
                System.out.println(g);
            }
        }else if(f>g){
            System.out.println(f);
        }else{
            System.out.println(g);
        }

//        Animal a = new Animal():
    }
}
