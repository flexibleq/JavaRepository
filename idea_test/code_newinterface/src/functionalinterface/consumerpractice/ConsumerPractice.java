package functionalinterface.consumerpractice;

import java.util.function.Consumer;

public class ConsumerPractice {
    public static void main(String[] args) {
        String[] strArray = {"林青霞,30","张曼玉,35","王祖贤,33"};
        for (int i = 0; i < strArray.length; i++) {
            String[] splitArr = strArray[i].split(",");
            printInfo(splitArr[0],splitArr[1],s-> System.out.print("姓名:"+s+","),s-> System.out.println("年龄:"+s));
        }

        printInfo(strArray,s-> System.out.print("姓名："+s.split(",")[0]),s-> System.out.println(",年龄："+s.split(",")[1]));
    }
    public static void printInfo(String name,String age, Consumer<String> con1,Consumer<String> con2){
        con1.accept(name);
        con2.accept(age);
        //con1.andThen(con2).accept(name);
    }

    public static void printInfo(String[] strArr,Consumer<String> con1,Consumer<String> con2){
        for(String str:strArr){
            con1.andThen(con2).accept(str);
        }
    }
}
