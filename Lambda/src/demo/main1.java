package demo;

public class main1 {
//lambda表达式即函数式接口
    public static void main(String[] args) {

    Animal A =new Animal() {
        @Override
        public void cry() {
            System.out.println("miao~~");
        }
    };
    A.cry();

    //lambda表达式
    Animal A1=()-> {
        System.out.println("miao~~miao~~");
    };
    A1.cry();


    //简化
    DOG A2 = a -> System.out.println("miao~~miao~~miao" + a);
    A2.cry(20);
    }





    @FunctionalInterface//声明函数式接口
    interface Animal{
        public abstract void cry();//只可以接口，一个方法
    }

    @FunctionalInterface//声明函数式接口
    interface DOG{
        public abstract void cry(int a);//只可以接口，一个方法
    }

}
