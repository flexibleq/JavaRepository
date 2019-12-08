package com.fxq.classcode.day08;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        File f = new File("F:\\我爱Java");
        f.mkdir();

        File f1 = new File(f,"java.txt");
        f1.createNewFile();
    }
}
