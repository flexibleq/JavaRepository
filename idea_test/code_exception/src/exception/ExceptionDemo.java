package exception;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("开始");
        show();
        System.out.println("结束");
    }

    public static void show(){
        int[] arr = {1,2,3};
        System.out.println(arr[3]);

    }

}
