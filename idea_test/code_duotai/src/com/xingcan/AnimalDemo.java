package com.xingcan;

public class AnimalDemo {
    public static void main(String[] args) {
        AnimalOperator ao = new AnimalOperator();
        Animal a = new Dog();
        ao.useAnimal(a);
        a.eat();

        Animal aaa = ao.getAnimal();
        aaa.eat();
    }
}
