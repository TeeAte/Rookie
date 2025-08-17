package DEMO;

import java.util.Scanner;

//自定义异常
public class Main3 {
    public static void main(String[] args)  {
        System.out.println("程序开始执行");
        //CTRL+ALT+T可以包围创建

        while (true) {
            try {
                Scanner  sc = new Scanner(System.in);
                System.out.println("请输入两个数字：");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(div(a, b));
                break;}

            catch (MyException e) {e.printStackTrace();}
            System.out.println("程序结束");

        }//尝试修复

    }
    public static int div(int a, int b) throws MyException {
        if (b == 0){
            throw new MyException("输入的数字不合法！！！");
        }
        return a / b;
    }
}
