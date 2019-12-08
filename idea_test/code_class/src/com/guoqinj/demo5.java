package com.guoqinj;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//有五个学生，每个学生有3门课的成绩，
// 从键盘输入以上数据（包括学生号，姓名，三门课成绩），
// 计算出平均成绩，
// 将原有的数据和计算出的平均分数存放在磁盘文件"stud"中。
public class demo5 {
    public static void main(String[] args) throws IOException {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        //创建集合
        ArrayList<Student> array = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第"+(i+1)+"个学生的学号：");
            int id = sc.nextInt();
            System.out.println("请输入第"+(i+1)+"个学生的姓名：");
            String name = sc.next();
            System.out.println("请输入第"+(i+1)+"个学生的语文成绩：");
            int chinese = sc.nextInt();
            System.out.println("请输入第"+(i+1)+"个学生的数学成绩：");
            int math = sc.nextInt();
            System.out.println("请输入第"+(i+1)+"个学生的英语成绩：");
            int english = sc.nextInt();
            Student s = new Student(name,id,chinese,math,english);
            array.add(s);
        }
        //创建字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\studentInfo.txt"));
        //遍历集合
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            int avg = s.getSum()/3;
            StringBuilder sb = new StringBuilder();
            sb.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getChinese()).append(",").append(s.getMath()).append(",").append(s.getEnglish()).append(",").append(avg);
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();

    }
}
