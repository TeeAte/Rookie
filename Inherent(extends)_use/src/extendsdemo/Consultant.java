package extendsdemo;
//子类，只用定义特殊的东西,复用代码
public class Consultant extends People{
    private int number;

    public Consultant(String name, String sex,int number) {
        super(name, sex);
        this.number=number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
