package com.fxq;

public class MethodTest {
    public static void main(String[] args) {
        boolean res = isEvenNumber(9);
        System.out.println(res);

        int c = getMax(10,20);
        System.out.println(c);
    }

    public static boolean isEvenNumber(int n){
        if(n % 2 == 0){
            return true;
        }else{
            return false;
        }
    }

    public static int getMax(int a,int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }
}
