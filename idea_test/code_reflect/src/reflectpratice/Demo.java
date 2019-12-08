package reflectpratice;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

//有一个ArrayList<Integer>集合，现在想在集合中添加一个字符串数据，如何实现
public class Demo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //创建集合对象
        ArrayList<Integer> array = new ArrayList<Integer>();
        //添加元素
        array.add(10);
        array.add(20);

        //获取Class对象
        Class<? extends ArrayList> c = array.getClass();
        //获取成员方法
        Method m = c.getMethod("add", Object.class);
        m.invoke(array,"hello");
        m.invoke(array,"world");
        m.invoke(array,"java");

        System.out.println(array);
    }
}
