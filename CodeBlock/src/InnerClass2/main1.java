package InnerClass2;

public class main1 {
    public static void main(String[] args) {
        //认识匿名内部类,本质是一个子类也是对象，继承的时候不用专门写一个类再new一个对象了。
        Animal Cat = new Animal() {
            @Override
            public void cry() {
                System.out.println("喵喵喵");
            }
        };

    }
}
