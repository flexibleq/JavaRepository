package com.fxq.homework.day05.subject03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//(1)定义List集合，存入多个字符串
//	(2)删除集合中包含0-9数字的字符串(只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串)
//	(3)然后利用迭代器遍历集合元素并输出
public class ListDelete {
    public static void main(String[] args) {
        //创建list集合
        List<String> list = new ArrayList<String>();
        //添加元素
        list.add("2wds");
        list.add("01294");
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("12342");
        list.add("hjshd");
        list.add("34df");
        list.add("sfg");



        //创建一个数组,存储0-9字符
        char [] arr = {'0','1','2','3','4','5','6','7','8','9'};
        //遍历集合
        for(int i=0;i<list.size();i++){
            //将取出来的字符串转为字符数组
            char[] chrArr = list.get(i).toCharArray();
            //设置标记值为true
            boolean flag = true;
            //进入循环
            while(flag) {
                //遍历转换的字符数组，和0-9数组作比较
                for (int k = 0; k < chrArr.length; k++) {
                    //遍历0-9字符数组
                    for (int j = 0; j < arr.length; j++) {
                        //如果有0-9的数字
                        if (chrArr[k] == arr[j]) {
                            //就将遍历到的元素删除
                            list.remove(i);
                            //将索引减1
                            i--;
                            //设置标记值为false
                            flag = false;
                            //退出内层for循环
                            break;
                        }
                    }
                    //如果标记值为false，退出外层for循环
                    if(flag == false){
                        break;
                    }
                }
                //设置标记值为false，防止死循环，退出while循环获取集合的下一个元素
                flag = false;
            }
        }

        //遍历集合
        //迭代器遍历
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}
