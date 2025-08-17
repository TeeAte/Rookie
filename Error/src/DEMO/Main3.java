package DEMO;

public class Main3 {
    public static void main(String[] args) throws MyException {
        System.out.println("程序开始执行");
        System.out.println(div(10, 0));
        System.out.println("程序结束");

    }
    public static int div(int a, int b) throws MyException {
        if (b == 0){
            throw new MyException("除数不能为0!!");
        }
        return a / b;
    }
}
