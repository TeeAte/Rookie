package demo;

import java.util.ArrayList;

public class Collection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        System.out.println( list);
        Object[] arr = list.toArray();
    }
}
