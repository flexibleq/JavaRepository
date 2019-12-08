package com.fxq;

public class AnimalDemo {
    public static void main(String[] args) {
        Jumpping j = new Cat();
        j.jump();
        System.out.println("--------------");
        Animal a = new Cat();
        a.setName("甲斐");
        a.setAge(5);
        System.out.println(a.getName()+","+a.getAge());

        int x=1;
        int y=2;

        switch(x){
            case 1:
                y++;
            default:
                y++;
            case 2:
                y++;
                break;
            case 3:
                y++;
                break;
        }
        System.out.println(y);
        int count = 0;
        for(double i=0.1;i<8448889;i*=2){
            count++;
        }
        System.out.println(count);

    }

}
