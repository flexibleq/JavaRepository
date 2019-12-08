package com.io.charstreamexception;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamException {
    public static void main(String[] args) {

    }

    //
    public static void method1(File f1, File f2) throws IOException {
        FileReader fr = new FileReader(f1);
        FileWriter fw = new FileWriter(f2);

        char[] chs = new char[1024];
        int len;
        while ((len = fr.read(chs)) != -1) {
            fw.write(chs, 0, len);
        }

        fr.close();
        fw.close();
    }

    //try---catch---finally
    public static void method2(File f1, File f2) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(f1);
            fw = new FileWriter(f2);

            char[] chs = new char[1024];
            int len;
            while ((len = fr.read(chs)) != -1) {
                fw.write(chs, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }

    //jdk1.7
    public static void method3(File f1, File f2) {
        try (FileReader fr = new FileReader(f1);
             FileWriter fw = new FileWriter(f2);) {
            char[] chs = new char[1024];
            int len;
            while ((len = fr.read(chs)) != -1) {
                fw.write(chs, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //jdk1.9
    public static void method4(File f1, File f2) throws IOException {
        FileReader fr = new FileReader(f1);
        FileWriter fw = new FileWriter(f2);
        try (fr;fw) {
            char[] chs = new char[1024];
            int len;
            while ((len = fr.read(chs)) != -1) {
                fw.write(chs, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
