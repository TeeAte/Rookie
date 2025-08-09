package InnerClass;

public class Outer {
public String OO="外部类变量";
        public class Inner{
            public String OO="内部类变量";
            public void show()
            {   String OO="方法类变量";
                System.out.println("show!");
                System.out.println(OO);
                System.out.println(this.OO);
                System.out.println(Outer.this.OO);
            }
        }


}
