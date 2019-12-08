package integerdemo;

public class IntegerDemo1 {
    public static void main(String[] args) {
        //public Integer(int value)，根据int值创建Integer对象（过时）
       /* Integer i1 = new Integer(100);
        System.out.println(i1);*/
        //public Integer(String s),根据String值创建Integer对象（过时）
        //Integer i2 = new Integer("123");
       // Integer i2 = new Integer("adf");NumberFormatException 里面的字符串只能是数字字符串
       // System.out.println(i2);

        //public static Integer valueOf(int i),返回表示指定的int值的Integer实例
        Integer i1 = Integer.valueOf(100);
        System.out.println(i1);
        //public static Integer valueOf(String s),返回一个保存指定值的Integer对象String
        Integer i2 = Integer.valueOf("123");
        System.out.println(i2);

       /* Integer i3 = Integer.valueOf("asd");
        System.out.println(i3);NumberFormatException异常：只能是数字字符串
        */
    }
}
