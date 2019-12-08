package filereflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

//通过配置文件运行类中的方法
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //创建properties对象
        Properties prop = new Properties();
        FileReader fr = new FileReader("code_reflect\\class.txt");
        prop.load(fr);
        fr.close();

        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");

        //获取Class对象
        Class<?> c = Class.forName(className);
        //获取无参构造创建对象
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        //获取成员方法
        Method m = c.getMethod(methodName);
        m.invoke(obj);
    }
}
