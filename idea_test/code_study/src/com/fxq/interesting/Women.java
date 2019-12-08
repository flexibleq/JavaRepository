package com.fxq.interesting;

public class Women {
    private String name;
    private int age;
    private String hobbies;

    public Women() {
    }

    public Women(String name, int age, String hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public void buy(){
        System.out.println("喜欢买东西，什么都喜欢买");
    }

    public void cry(){
        System.out.println("喜欢哭");
    }
}
