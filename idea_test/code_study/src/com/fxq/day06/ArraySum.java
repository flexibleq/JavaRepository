package com.fxq.day06;

public class ArraySum {
    public static void main(String[] args) {
        //创建一个数组
        int [] arr = {68,27,95,88,171,996,51,210};
        //定义求和变量
        int sum = 0;
      /*  for(int i=0;i<arr.length;i++){
            if(arr[i]/10!=7 && arr[i]%10!=7 && arr[i]%2 ==0){
                sum += arr[i];
            }
        }
        System.out.println(sum);*/

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]/10==7 || arr[i]%10==7 || arr[i]%2 !=0){
                continue;
            }
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
