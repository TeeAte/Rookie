package StringAPI;
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("hello");
        list.add("bitch");
        System.out.println(list);
        System.out.println(list.get(0));

        list.remove(3);
        list.set(3,"fuck");
        System.out.println(list);

    }

}

