package com.forDemo;

public class JiuJiuChengFa {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(i*j)+" ");
            }
            System.out.println();
        }
        System.out.println("------这是一条华丽的分割线------");
        for(int i=9;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(i*j)+" ");
            }
            System.out.println();
        }

        System.out.println("------这是一条华丽的分割线------");

        for(int i=9;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(j+"*"+i+"="+(i*j)+" ");
            }
            System.out.println();
        }
    }
}
