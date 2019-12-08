package com.guoqinj;

//输入两个正整数m和n，求其最大公约数和最小公倍数
public class demo6 {
    public static void main(String[] args) {
        int gy = getGY(24, 36);
        int gb = getGB(2,3);
        System.out.println(gy);
        System.out.println(gb);
    }

    //求最大公约数
    public static int getGY(int a, int b) {
        int gy = 0;
        while (a % b > 0) {
            a = a % b;
            if(a < b){
                int temp = a;
                a = b;
                b = temp;
            }
            if(a % b == 0){
                gy = b;
            }
        }
        return gy;
    }

    //求最小公倍数
    public static int getGB(int a,int b){
        return (a * b)/getGY(a,b);
    }
}
