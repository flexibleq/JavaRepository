package com.mathdemo;

public class MathDemo {
    public static void main(String[] args) {
        //public static int abs(int a),返回参数的绝对值
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));
        //public static double ceil(double a),返回大于或等于参数的最小double值，等于一个整数
        System.out.println(Math.ceil(12.34));
        System.out.println(Math.ceil(13.45));

        System.out.println(Math.floor(12.34));
        System.out.println(Math.floor(13.45));

        System.out.println(Math.round(12.3));
        System.out.println(Math.round(12.6));

        System.out.println(Math.max(23,45));

        System.out.println(Math.min(34,23));

        System.out.println(Math.pow(2.0,8.0));

        System.out.println((int)(Math.random()*100));
    }
}
