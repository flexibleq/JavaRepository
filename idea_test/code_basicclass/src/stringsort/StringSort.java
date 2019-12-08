package stringsort;

import java.util.Arrays;
//将指定字符串中的数字内容排序输出
public class StringSort {
    public static void main(String[] args) {
        //定义一个字符串
        String s = "12 65 43 21 6 37 11 9";
        //将字符串转换成一个字符数组
        String[] strArr = s.split(" ");
       /* 输出字符数组
        for(int i=0;i<strArr.length;i++){
            System.out.println(strArr[i]);
        }*/

       //将字符串数组转换成一个int型数组
        //定义一个int 型数组
        int [] arr = new int[strArr.length];
        for(int i= 0;i<strArr.length;i++){
            arr[i] = Integer.parseInt(strArr[i]);
        }
        /*遍历数组
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }*/
        //对数组元素进行排序
        //方法一
        //Arrays.sort(arr);
        //方法二 冒泡排序
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
            }

            }
        }
        //将int数组拼接成一个字符串
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(i == arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(" ");
            }
        }

        String ss = sb.toString();
        System.out.println(ss);

    }
}
