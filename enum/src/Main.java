import javax.lang.model.type.NullType;
import java.util.Scanner;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        A a1=A.X;
        A a2=A.Y;
        System.out.println(a1);//输出名字
        System.out.println(a2.ordinal());//输出索引
        Scanner sc=new Scanner(System.in);
        move(null);
        move(Direction.UP);
    }

    public static void move(Direction di) {
        switch (di){
            case UP -> System.out.println("向上移动");
            case Down -> System.out.println("向下移动");
            case Left -> System.out.println("向左移动");
            case Right -> System.out.println("向右移动");
            case null, default -> System.out.println("无响应");



        }

    }
}