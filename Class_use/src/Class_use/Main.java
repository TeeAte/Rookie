package Class_use;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Student s= new Student(50);//创建对象

        System.out.println("请输入姓名:");
        Scanner sc=new Scanner(System.in);//扫描器
        s.setName(sc.next());//调用对象方法，设置名字

        StuOperater operate = new StuOperater();//学生操作对象方法，方法放在StuOperater
        operate.printStuScore(s);

        System.out.println(s.getName()+"的成绩为:"+s.grade);//直接操作方法

        Student.printAge();//静态方法直接用;类.方法;名字调用


    }


}
