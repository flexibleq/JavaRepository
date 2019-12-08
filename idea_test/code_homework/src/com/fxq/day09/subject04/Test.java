package com.fxq.day09.subject04;

import java.util.ArrayList;

//1,自定义一个汽车类Car
//	 包含属性： 品牌 brand (String 类型)
//				  里程  mile (int 类型)
//				  价格  price (double 类型)
//
//	 要求所有属性私有修饰
//		生成get、set方法
//		空参、满参构造
//
//	2,定义测试类Test
//	在main方法中创建三个Car对象，将多个car对象添加到集合
//
//	3,测试类中自定义方法show(ArrayList<Car> list,int mile,double price)
//	在该方法内部显示 里程不能低于mile,并且价格不高于price 的Car信息
public class Test {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Car> array = new ArrayList<Car>();
        //创建汽车对象
        Car c1 = new Car("宝马",10000,999999.9);
        Car c2 = new Car("奔驰",20000,888888.8);
        Car c3 = new Car("大众",40000,333333.3);
        //将多个car对象添加到集合
        array.add(c1);
        array.add(c2);
        array.add(c3);
        //调用方法
        show(array,20000,1000000);
    }
    //测试类中自定义方法show(ArrayList<Car> list,int mile,double price)
    public static void show(ArrayList<Car> list,int mile,double price){
        for (int i = 0; i < list.size(); i++) {
            Car car = list.get(i);
            if(car.getMile() >= mile && car.getPrice() <=price ){
                System.out.println(car.getBrand()+","+car.getMile()+","+car.getPrice());
            }
        }
    }
}
