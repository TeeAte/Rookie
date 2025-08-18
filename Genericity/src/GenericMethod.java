public class GenericMethod {
    public static void main(String[] args) {
    String[] names = {"张三","李四","王五"};
    printarray(names);

    }

    public static <T> void printarray(T[] Arr){
    for (T t : Arr) {
        System.out.println(t);
    }
    }



}
