package DEMO;
// 异常处理：try-catch-finally
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main1 {
    public static void main(String[] args) throws ParseException {
        show("2025-05-15 22:27:44");

        try {//相当于监视异常
            show("2025-05-15 ");
        }
        catch (ParseException e) {//捕获异常
            e.printStackTrace();
            System.out.println("程序出错了！");
        }
    }

    public static void show(String str) throws ParseException {//抛出异常
        System.out.println("\n"+"===程序开始===");
        // 编译异常：编译阶段报错，编译不通过。
        // 把字符串时间解析成 Java 中的一个日期对象。
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str); // 编译时异常，提醒程序员这里的程序很容易出错，请您注意！
        System.out.println(date);

        System.out.println("==程序结束==");
    }

}
