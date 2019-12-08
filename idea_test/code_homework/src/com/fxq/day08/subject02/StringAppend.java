package com.fxq.day08.subject02;

import java.util.Scanner;

//不断的循环录入字符串,然后将字符串进行拼接(请使用StringBuilder)
//	注意:如果录入的数据是 end ,那么就不需要拼接 (此时循环结束)
//
//	最后统计该字符串 大写字母 小写字母 数字字符 和其它字符出现的次数
public class StringAppend {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        //创建StringBuilder对象
        StringBuilder sb = new StringBuilder();
        while(true){
            System.out.println("请输入一个字符串：");
            String line = sc.nextLine();
            if(line.equals("end")){
                break;
            }
            sb.append(line);
        }
        String s = sb.toString();
        //定义三个计数器
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        int otherCount = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='a' && c<='z'){
                smallCount++;
            }else if(c>='A' && c<='Z'){
                bigCount++;
            }else if(c>='0' && c<='9'){
                numberCount++;
            }else{
                otherCount++;
            }
        }
        System.out.println("大写字母出现了："+bigCount+"次");
        System.out.println("小写字母出现了："+smallCount+"次");
        System.out.println("数字出现了："+numberCount+"次");
        System.out.println("其他字符出现了："+otherCount+"次");

    }
}
