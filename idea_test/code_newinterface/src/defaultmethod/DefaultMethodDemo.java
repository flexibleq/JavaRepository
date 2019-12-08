package defaultmethod;

public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyInterImpl1 my1 = new MyInterImpl1();
        my1.show1();
        my1.show2();
        my1.show3();
        System.out.println("-----------------");
        MyInterImpl2 my2 = new MyInterImpl2();
        my2.show1();
        my2.show2();
        my2.show3();
    }
}
