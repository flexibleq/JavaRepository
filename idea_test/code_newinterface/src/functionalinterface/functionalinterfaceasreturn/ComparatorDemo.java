package functionalinterface.functionalinterfaceasreturn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("aaaaa");
        array.add("bbb");
        array.add("cc");
        array.add("ggdsgsd");
        array.add("e");
        //排序前
        System.out.println("排序前：" + array);
        Collections.sort(array, getComparator());
        System.out.println("排序后：" + array);
    }

    public static Comparator<String> getComparator() {
        /*Comparator<String> cp = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
//                return 0;
                return s1.length() - s2.length();
            }
        };

        return cp;
    }*/
       /* return new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };*/

       /* return (String s1,String s2)->{
            return s2.length() - s1.length();
        };*/
       return (s1,s2)->s2.length() - s1.length();
    }
}
