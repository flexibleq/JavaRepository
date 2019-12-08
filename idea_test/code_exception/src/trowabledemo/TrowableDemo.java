package trowabledemo;
//public String getMessage():返回此Trowable的详细信息字符串
//public String toString():返回可抛出的简短描述
//public void printStackTrace():把异常的错误信息输出在控制台
public class TrowableDemo {
    public static void main(String[] args) {
        System.out.println("开始");
        show();
        System.out.println("结束");
    }

    public static void show(){
        try{
            int [] arr = {1,2,3};
            System.out.println(arr[3]);
        }catch(ArrayIndexOutOfBoundsException e){
           // System.out.println(e.getMessage());
            //System.out.println(e.toString());
            e.printStackTrace();
        }


    }
}
