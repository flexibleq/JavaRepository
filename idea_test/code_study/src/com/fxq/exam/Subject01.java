package com.fxq.exam;


import java.util.Random;
import java.util.Scanner;

//定义两个长度为3的数组arr1和arr2，
// 第一个数组使用键盘录入三个值，
// 要求arr1全部是奇数，如果录入偶数要提示错误重新输入。
// 第二个数组录入三个7-25的随机数，最后打印出两个数组的总和。
public class Subject01 {
    public static void main(String[] args) {
        int [] arr1 = new int[3];
        int [] arr2 = new int[3];
        //定义求和变量
        int sum1 = 0;
        int sum2 = 0;
        //创建随机数对象
        Random r = new Random();
       //键盘录入
        Scanner sc = new Scanner(System.in);
        //为第一个数组赋值
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("请输入第"+(i+1)+"个奇数：");
            int num = sc.nextInt();
            if(num % 2 !=0){
                arr1[i] = num;
            }else{
                System.out.println("输入错误");
                i--;
            }
        }
        //求第一个数组的和
        for (int i = 0; i < arr1.length; i++) {
            sum1+=arr1[i];
        }

        //为第二个数组赋值
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = r.nextInt(19)+7;
        }
        //求第二个数组的和
        for (int i = 0; i < arr2.length; i++) {
            sum2+=arr2[i];
        }
        //输出总和
        System.out.println(sum1+sum2);
    }
}
