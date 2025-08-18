package Demo1;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        //认识泛型
        ArrayList<String> list = new ArrayList<>();//统一类型
        list.add("hello");
        list.add("world");
        list.add("java");

        System.out.println(list.get(0));//返回的是字符串而不是Object
    }
}
