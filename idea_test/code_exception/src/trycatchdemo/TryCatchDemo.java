package trycatchdemo;

public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("开始");
        show();
        System.out.println("结束");
    }

    public static void show() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

    }
}
