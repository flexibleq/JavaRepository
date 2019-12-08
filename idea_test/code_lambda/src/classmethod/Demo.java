package classmethod;

public class Demo {
    public static void main(String[] args) {
        //Lambda表达式
        show(s->Integer.parseInt(s));
        //引用类方法
        //Lambda表达式被引用类方法代替的时候，他的形式参数全部传递给引用类方法作为参数
        show(Integer::parseInt);
    }
    public static void show(Inter i){
        int num = i.convert("100");
        System.out.println(num);

    }
}
