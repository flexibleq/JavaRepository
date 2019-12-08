package com.fxq.day05;

public class OverloadDemo {
    public static void main(String[] args) {
        boolean bInt = compare(10, 20);
        boolean bByte = compare((byte)10,(byte)20);
        boolean bShort = compare((short)10,(short)20);
        boolean bLong = compare(10l,20l);
        System.out.println(bInt);
        System.out.println(bByte);
        System.out.println(bShort);
        System.out.println(bLong);
    }

    //int
    public static boolean compare(int a,int b){
        System.out.println("int");
        return a==b;
    }

    //byte
    public static boolean compare(byte a,byte b){
        System.out.println("byte");
        return a==b;
    }
    //short
    public static boolean compare(short a,short b){
        System.out.println("short");
        return a==b;
    }

    //Long
    public static boolean compare(long a,long b){
        System.out.println("long");
        return a==b;
    }
}
