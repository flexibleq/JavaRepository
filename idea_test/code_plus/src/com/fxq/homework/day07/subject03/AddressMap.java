package com.fxq.homework.day07.subject03;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

//有2个数组，第一个数组内容为：[黑龙江省,浙江省,江西省,广东省,福建省]，
//第二个数组为：[哈尔滨,杭州,南昌,广州,福州]，
// 将第一个数组元素作为key，第二个数组元素作为value存储到Map集合中。
public class AddressMap {
    public static void main(String[] args) {
        //第一个数组内容为：[黑龙江省,浙江省,江西省,广东省,福建省]
        String [] provinces = {"黑龙江省","浙江省","江西省","广东省","福建省"};
        //第二个数组为：[哈尔滨,杭州,南昌,广州,福州]
        String [] cities = {"哈尔滨","杭州","南昌","广州","福州"};
        //创建集合对象
        HashMap<String,String> hm = new HashMap<String,String>();

        //遍历数组添加元素
        for(int i=0;i<provinces.length;i++){
            hm.put(provinces[i],cities[i]);
        }
        //遍历集合
        //方式一
        //获取集合所有键的集合
        Set<String> keySet = hm.keySet();
        System.out.print("{");
        for(String key:keySet){
            String value = hm.get(key);
            System.out.print(key+"="+value+" ");
        }
        System.out.print("}");

    }
}
