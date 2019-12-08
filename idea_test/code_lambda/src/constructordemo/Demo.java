package constructordemo;

public class Demo {
    public static void main(String[] args) {
        //Lambda表达式
        /*useStudent((String name,int age)->{
            return new Student(name,age);
        });*/

        useStudent((name,age)->new Student(name,age));

        //引用构造器
        //Lambda表达式被引用构造器代替的时候，他的参数全部传递给后者做参数
        useStudent(Student::new);
    }
    public static void useStudent(StudentBuilder sb){
        Student s = sb.build("张三丰", 100);
        System.out.println(s.getName()+","+s.getAge());
    }
}
