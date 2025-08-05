package Class_use;

public class Student {
    //类里面的元素
    private String name; //私有变量，main函数不可以用'.'来访问
    public int grade;
    static int age = 15; //静态变量，创建不同的student共享一个age

    public Student(int grade){
        this.grade=grade;
    }

    //方法们
    public void setName(String a) {
        this.name = a;
    }
    public String getName(){return name;}

    public static  void printAge(){
        System.out.println("Student's age :"+age);
    }









}

