package classmethoddemo;

public class Demo {
    public static void main(String[] args) {
        //Lambda表达式
        /*useMyString((String s,int x,int y) ->{
            return s.substring(x,y);
        });*/
        useMyString((s,x,y)->s.substring(x,y));

        //引用类实例方法
        //在Lambda表达式被引用类实例方法替代的时候
        //第一个参数作为调用者
        //后面的参数全部传递给该方法作为参数
        useMyString(String::substring);
    }
    public static void useMyString(MyString ms){
        String result = ms.mySubString("helloworld", 3, 6);
        System.out.println(result);
    }
}
