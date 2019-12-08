package com.fxq.day04;
/*分析以下需求并实现
        键盘录入一个数，判断这个数是否在数组中,如果存在就打印该元素的索引,不存在
        请打印-1 (注意:如果有多个,请打印第一个元素的索引)
        例如: 数组里有{9,5,2,7,7} ,假如要找的元素为 7, 那么它的索引应该为 3*/

import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {

        //定义一个数组
        int [] arr = {9,5,2,7,7};
        //键盘录入一个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int number = sc.nextInt();
        int index = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == number){
               index = i;
               break;
            }
        }
        System.out.println(index);
    }
}
