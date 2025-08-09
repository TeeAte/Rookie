package InnerClass;

public class Main1 {
    //内部类的使用
    public static void main(String[] args) {
        Outer.Inner innerObj = new Outer().new Inner();
        innerObj.show();
    }






}
