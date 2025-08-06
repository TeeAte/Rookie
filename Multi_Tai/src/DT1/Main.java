package DT1;

public class Main {
    public static void main(String[] args) {
        //对象多态
      Animal a1=new Turtle();
      Animal a2=new Wolf();
      a1.run();
      a2.run();

    }
}
