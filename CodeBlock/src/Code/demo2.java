package Code;

public class demo2 {

    //实例代码快的使用,每次创建对象都会执行代码块中的内容
    {
        System.out.println("实例代码块执行了");
    }
    public static void main(String[] args) {
        System.out.println("main方法执行了");
        new demo2();
    }
}
