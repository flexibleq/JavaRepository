package com.fxq.day06;

import java.util.Scanner;

//1.键盘录入10个整数存入数组中
//	2.定义一个方法将奇数放在数组的左侧,偶数放在数组的右侧
//	3.定义一个方法打印原数组和处理后的数组
//	4.定义一个方法传入一个int类型数组，输出这个数组中只出现一次的数字及个数
public class ArrayOperator {
    public static void main(String[] args) {
        //创建数组
        int[] arr = new int[10];
        int[] newArr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个整数");
            arr[i] = sc.nextInt();
        }
        moveArray(arr, newArr);
        printArray(arr, newArr);
        System.out.println("---------");
        countArray(arr);
        countArr(arr);

    }

    public static void moveArray(int[] arr, int[] newArr) {
        int count = 0;
        int count1 = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                newArr[count] = arr[i];
                count++;
            } else {
                newArr[arr.length - count1] = arr[i];
                count1++;
            }
        }
    }

    public static void printArray(int[] arr, int[] arr1) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
    //定义一个方法传入一个int类型数组，输出这个数组中只出现一次的数字及个数
    public static void countArray(int[] arr) {
        //定义变量存储个数
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //定义flag = true；表示在它之前没有相同的元素
            boolean flag = true;
            //跟它之前的元素进行比较，如果有相同的，把flag 变为false
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = false;
                }
            }
            //定义一个计数器
            int count = 0;
            //如果之前没有跟他相同的元素
            if (flag) {
                //就跟所有的元素进行一次比较
                for (int k = 0; k < arr.length; k++) {
                    //如果有相同的元素，计数器+1
                    if (arr[i] == arr[k]) {
                        count++;
                    }
                }
                //判断计数器是否为1，是则输出为1的元素，并将个数+1
                if (count == 1) {
                    System.out.print(arr[i] + " ");
                    sum++;
                }
            }
        }
        //输出只出现过一次的元素的个数
        System.out.println("只出现过一次的数字共有：" + sum + "个");

    }
    //简化版
    public static void countArr(int[] arr) {
        //定义两个计数器，一个用来存储某个元素出现的次数，一个用来存储只出现一次元素的个数
        int count;
        int sum = 0;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //将计数器归0
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                //将每个元素与数组的每个元素进行比较，如果有相同的
                //计数器+1
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            //如果计数器为1，输出只出现过一次的元素，将个数计数器+1
            if(count == 1){
                System.out.print(arr[i]+" ");
                sum++;
            }
        }
        //输出个数计数器的值
        System.out.println("只出现过一次的数字共有："+sum+"个");
    }
}

