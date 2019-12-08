package objectmethod;

public class Demo {
    public static void main(String[] args) {
        //Lambda表达式
        /*usePrint((String s) ->{
            String result = s.toUpperCase();
            System.out.println(result);
        });*/
        usePrint(s-> System.out.println(s.toUpperCase()));

        //引用对象实例方法
        //在Lambda表达式被引用对象实例方法替代的时候，Lambda表达式的形式参数全部传递给引用对象实例方法作为参数
        PrintString ps = new PrintString();
        usePrint(ps::printToUpper);
    }
    public static void usePrint(Print p){
        p.printUpper("helloWorldjavase");
    }
}
