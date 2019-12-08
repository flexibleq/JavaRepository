package com.xingcan;
//方法的形参是类名，其实需要的是该类的对象
//方法的返回值是类名，其实返回的是该类的对象
public class CatDemo {
    public static void main(String[] args) {
        CatOperator co = new CatOperator();
        Cat c = new Cat();
        co.useCat(c);
    }
}
