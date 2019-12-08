package com.fxq.classcode.day10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class StudentToFile {
    public static void main(String[] args) throws IOException {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        //创建集合对象
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s2.getSum() - s1.getSum();
                int num2 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
                int num3 = num2 == 0 ? s1.getMath() - s2.getMath() : num2;
                int num4 = num3 == 0 ? s1.getName().compareTo(s2.getName()) : num3;
                return num4;
            }
        });

        //循环输入学生信息
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入学生姓名：");
            String name = sc.next();
            System.out.println("请输入学生的语文成绩：");
            int chinese = sc.nextInt();
            System.out.println("请输入学生的数学成绩：");
            int math = sc.nextInt();
            System.out.println("请输入学生的英语成绩：");
            int english = sc.nextInt();

            //创建学生对象
            Student s = new Student();
            s.setName(name);
            s.setChinese(chinese);
            s.setMath(math);
            s.setEnglish(english);

            //添加元素到集合
            ts.add(s);
        }
        //创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("code_plus\\stu.txt"));
        //遍历集合
        for(Student s:ts){
            StringBuilder sb = new StringBuilder();
            sb.append(s.getName()).append(",").append(s.getChinese()).append(",").append(s.getMath()).append(",").append(s.getEnglish());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        //释放资源
        bw.close();
    }
}
