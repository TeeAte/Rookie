package Code;

import java.lang.reflect.Array;
import java.util.Arrays;

public class demo1 {
    public static String a;
    public static String[] cards =new String[5];
    //代码块：自动执行一次，类加载时执行,优先执行
    static {
    System.out.println("代码块执行了");
    a = "静态名字打印";//可以在代码快初始化静态变量
    cards[0]="A";
    cards[1]="2";
    cards[2]="3";
    cards[3]="4";//放在代码块中初始化只用初始化一次
    }


    public static void main(String[] args) {
        System.out.println("main方法执行了");
        System.out.println(a);
        System.out.println(Arrays.toString(cards));//API 打印数组

    }
}
