package lambdapractice2;

public class AddableDemo {
    public static void main(String[] args) {
        //lambda表达式
        useAddable((int a,int b) -> {
            return a*b;
        });
    }
    public static void useAddable(Addable a){
        int sum = a.add(10, 20);
        System.out.println(sum);
    }
}
