package functionalinterface.predicatetest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        String[] strArr = {"林青霞,30","柳岩,34","张曼玉,35","貂蝉,31","王祖贤,33"};
        //方法一
        //创建集合对象
        ArrayList<String> array = new ArrayList<String>();
        for(String str:strArr){
            boolean result = checkInfo(str, s -> s.split(",")[0].length() > 2, s -> Integer.parseInt(s.split(",")[1]) > 33);
            if(result){
                array.add(str);
            }
        }
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
        System.out.println("-------------------------");
        //方法二
        ArrayList<String> array1 = myFilter(strArr, s -> s.split(",")[0].length() > 2,
                s -> Integer.parseInt(s.split(",")[1]) > 33
        );
        for(String s:array1){
            System.out.println(s);
        }

    }

    public static boolean checkInfo(String s, Predicate<String> pre1,Predicate<String> pre2){
      return  pre1.and(pre2).test(s);
    }

    public static ArrayList<String> myFilter(String[] strArr,Predicate<String> pre1,Predicate<String> pre2){
        //创建集合对象
        ArrayList<String> array = new ArrayList<String>();
        //遍历数组
        for(String str:strArr){
            if (pre1.and(pre2).test(str)) {
                array.add(str);
            }
        }
        return array;
    }
}
