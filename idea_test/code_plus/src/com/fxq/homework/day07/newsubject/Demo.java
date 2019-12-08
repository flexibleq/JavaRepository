package com.fxq.homework.day07.newsubject;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

//1.1．从命令行读入一个字符串，表示一个年份，
// 输出该年的世界杯冠军是哪支球队。
// 如果该 年没有举办世界杯，则输出：没有举办世界杯。
//			//tips:参阅Map接口containsKey(Object key)方法 
//
//1.2．在原有世界杯Map 的基础上，增加如下功能： 
// 读入一支球队的名字，输出该球队夺冠的年份列表。
//  例如，读入“巴西”，
// 应当输出 1958 1962 1970 1994 2002 
// 读入“荷兰”，应当输出 没有获得过世界杯 
public class Demo {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        //创建集合对象
        HashMap<Integer,String> hm = new HashMap<Integer, String>();
        //添加元素
        hm.put(1930,"乌拉圭");
        hm.put(1934,"意大利");
        hm.put(1938,"意大利");
        hm.put(1950,"乌拉圭");
        hm.put(1954,"西德");
        hm.put(1958,"巴西");
        hm.put(1962,"巴西");
        hm.put(1966,"英格兰");
        hm.put(1970,"巴西");
        hm.put(1974,"西德");
        hm.put(1978,"阿根廷");
        hm.put(1982,"意大利");
        hm.put(1986,"阿根廷");
        hm.put(1990,"西德");
        hm.put(1994,"巴西");
        hm.put(1998,"法国");
        hm.put(2002,"巴西");
        hm.put(2006,"意大利");
        System.out.println("请输入一个年份：");
        while(true){
            try {
                String line = sc.nextLine();
                int year = Integer.parseInt(line);
                if(hm.containsKey(year)){
                    System.out.println(year+"年的世界杯冠军是"+hm.get(year)+"球队");
                    break;
                }else{
                    System.out.println(year+"年没有举办世界杯");
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("输入有误，请输入正确的年份：");
            }
        }

        System.out.println("请输入一支球队的名字：");
        String name = sc.nextLine();
        if(!hm.containsValue(name)){
            System.out.println("没有获得过世界杯");
        }
        Set<Integer> keySet = hm.keySet();
        for(int year:keySet){
            if(hm.get(year).equals(name)){
                System.out.print(year+" ");
            }
        }
    }
}
