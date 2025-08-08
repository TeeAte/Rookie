package Demo;

public class Imp1 implements ClassDataInter{
    private Student[] students;//记住送进来的全部学生

    public Imp1(Student[] students){
        this.students=students;
    }


    @Override
    public void printAll() {
        for (Student student : students) {
            System.out.println(student);
        }

    }

    @Override
    public void printAvgScore() {
        System.out.println("平均成绩为:");
        double sum=0;
        for (Student student : students) {
            sum+=student.getScore();
        }
        System.out.println(sum/students.length);

    }
}
