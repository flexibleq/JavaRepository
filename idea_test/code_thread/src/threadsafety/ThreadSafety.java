package threadsafety;

import java.util.*;

/*
* 线程安全的类
* StringBuffer
* Vector
* Hashtable
* */
public class ThreadSafety {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        Vector<String> v = new Vector<String>();
        Hashtable<String,String> ht = new Hashtable<String,String>();

        List<String> strings = Collections.synchronizedList(new ArrayList<String>());
    }
}
