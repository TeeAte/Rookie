import java.util.ArrayList;
import java.util.List;
// 目标：认识Stream流，掌握其基本使用步骤。体会它的优势和特点。
public class main1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张翠山");

        // 1、先用传统方案：找出姓张的人，名字为3个字的，存入到一个新集合中去。
        List<String> newList = new ArrayList<>();
        for (String name : list) {
            if (name.startsWith("张") && name.length() == 3) {
                newList.add(name);
            }
        }
        System.out.println(newList);
        System.out.println("\n");

        // 2、使用Stream流解决，这里补充完整，比如收集结果并输出
        List<String> streamResult = list.stream()
                .filter(s -> s.startsWith("张"))
                .filter(s -> s.length() == 3)
                .toList();
        System.out.println(streamResult);
    }
}