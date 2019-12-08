package day08;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        File f1 = new File("F:\\iostream\\java.txt");
        System.out.println(f1);

        File f2 = new File("F:\\iostream","java.txt");
        System.out.println(f2);

        File f3 = new File("F:\\iostream");
        File f4 = new File(f3,"java.txt");
        System.out.println(f4);
    }
}
