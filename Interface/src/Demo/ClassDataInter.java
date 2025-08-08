package Demo;

public interface ClassDataInter {
    void printAll();
    void printAvgScore();
    default void go(){
        //加了default之后就有具体实现了
        System.out.println("go go go");
    };
}
