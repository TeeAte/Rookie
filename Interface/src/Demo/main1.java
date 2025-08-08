package Demo;

public class main1 {

    public static void main(String[] args) {

        Student[] Allstudents = new Student[3];
        Allstudents[0]=new Student("张三","男",99.0);
        Allstudents[1]=new Student("张四","男",91.0);
        Allstudents[2]=new Student("张五","男",29.3);

        ClassDataInter cdi = new Imp1(Allstudents);

        cdi.printAll();
        cdi.printAvgScore();

    }}

