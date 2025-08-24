package demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        //list集合的特点: 有序,可重复,集合中元素个数可变
        List<String> list = new ArrayList();
        list.add("hello");
        list.add("world");
        System.out.println(list);
        list.forEach(System.out::println);


        //set集合的特点: 无序,不可重复,集合中元素个数可变
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
        set.add("world");
        System.out.println(set);

    }

}
