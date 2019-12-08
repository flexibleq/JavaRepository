package com.fxq.interesting;

public class Test {
    public static void main(String[] args) {
        Women w = new Women("张新琪",1,"购物，美食");
        System.out.println(w.getName()+","+w.getAge()+","+w.getHobbies());
        w.buy();
        w.cry();
    }
}
