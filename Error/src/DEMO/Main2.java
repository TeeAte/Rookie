package DEMO;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("程序开始执行");
        System.out.println(div(10, 0));
        System.out.println("程序结束");

    }
    public static int div(int a, int b) {
        if (b == 0){
            throw new RuntimeException("除数不能为0!!");
        }
        return a / b;
    }
}
