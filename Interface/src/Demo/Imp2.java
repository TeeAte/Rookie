package Demo;

public class Imp2 implements ClassDataInter{
    private final Student[] students;//记住送进来的全部学生

    public Imp2(Student[] students){
        this.students=students;
    }


    /**
     * 打印所有学生信息
     * 该方法遍历学生集合，将每个学生对象输出到控制台
     */
    @Override
    public void printAll() {
        System.out.println("所有学生2为:");
        // 遍历所有学生并打印信息
        for (Student student : students) {
            System.out.println(student);
        }

    }


    @Override
    public void printAvgScore() {
        System.out.println("平均成绩2为:");
        double sum=0;
        for (Student student : students) {
            sum+=student.getScore();
        }
        System.out.println(sum/students.length);

    }
}
