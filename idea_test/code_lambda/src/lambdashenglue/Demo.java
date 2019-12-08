package lambdashenglue;

public class Demo {
    public static void main(String[] args) {
        //lambda表达式
        //参数类型可以省略，但是有多个参数的情况下，不能只省略一个
        useAddable((a,b) ->{
            return a+b;
        });
        useFlyable((s -> {
            System.out.println(s);
        }));

        //如果参数有且只有一个，那么小括号可以省略
        useFlyable(s -> {
            System.out.println(s);
        });

        //如果代码块的语句只有一条，可以省略大括号和分号，甚至是return
        useFlyable(s-> System.out.println(s));
        useAddable((a,b) -> a+b);
    }
    public static void useFlyable(Flyable f){
        f.fly("风和日丽，晴空万里");
        System.out.println("飞机自驾游");
    }
    public static void useAddable(Addable a){
        int sum = a.add(10, 30);
        System.out.println(sum);
    }
}
