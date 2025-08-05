package extendsdemo;

import java.time.format.TextStyle;

public class Main {
    public static void main(String[] args) {
    Teacher t =new Teacher("null","male","null");
    t.setName("张三");//直接用父类的方法
    t.setSkill("java");
        System.out.println(t.getName());
        System.out.println(t.getSex());
        System.out.println(t.getSkill()+"\n");
        t.show();
    }
}
