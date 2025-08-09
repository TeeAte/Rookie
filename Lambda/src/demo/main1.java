package demo;

public class main1 {

    public static void main(String[] args) {
    Animal A =new Animal(){
        @Override
        public void cry() {
            System.out.println("miao~");
        }
    }

    }

    abstract static class Animal{

        public abstract void cry();
    }

}
