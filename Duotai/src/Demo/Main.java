package Demo;

import lombok.val;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    GoldCard GC=new GoldCard("粤J1","金卡用户","137",5000);
    pay(GC);
    SilverCard SC=new SilverCard("粤J2","银卡用户","137",3000);
    pay(SC);
}

    public static void pay(card card1) {
        System.out.println("余额为"+card1.getMoney()+"元");
        System.out.println("请输入消费金额");
        Scanner sc= new Scanner(System.in);
        double Money = sc.nextDouble();
        card1.consume(Money);

    }

}
