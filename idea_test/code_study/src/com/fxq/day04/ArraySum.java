package com.fxq.day04;


import java.util.Random;

public class ArraySum {
    public static void main(String[] args) {
        //创建一个长度为6的数组
        int[] arr = new int[6];
        //创建随机数对象
        Random r = new Random();
        for(int i=0;i<arr.length;i++){
            int num = r.nextInt(2);
            boolean flag = false;
            do{
                flag = false;
                for(int j=0;j<i;j++){
                    if(arr[j] == num){
                        flag = true;
                        num = r.nextInt(2);
                        break;
                    }
                }
            }while(flag);
            arr[i] = num;
            System.out.println(arr[i]);
        }
       /* for(int i=0;i<arr.length;i++){
            int number = r.nextInt(10);
            System.out.print(number+"---");
            arr[i] = number;

            for(int j=1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    number = r.nextInt(10);
                    System.out.print(number);
                    arr[i] = number;
                    i=0;
                }else{
                    System.out.println(arr[i]);
                    break;
                }
            }
        }*/
    }
    }