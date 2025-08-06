package A1;

//继承抽象类的类必须要重写全部抽象方法,要不就直接搞成抽象类
public class B extends A{
    @Override
    public void show() {
        System.out.println("重写之后的show方法");
    }
}
