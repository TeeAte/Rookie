package Demo1;

public class Main2 {
    public static void main(String[] args) {
        MyArrayList<String> mylist = new MyArrayList<>();
        mylist.add("hello");
        mylist.add("world");
        System.out.println(mylist.remove("hello"));
        System.out.println(mylist);


    }
}
