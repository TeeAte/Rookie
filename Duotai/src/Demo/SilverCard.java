package Demo;

public class SilverCard extends card{

    public SilverCard(String id, String name, String phone, double money) {
        super(id,name,phone,money);
    }

    public void consume(double m) {
        System.out.println("您当前消费:" + m);
        System.out.println("优惠最后的价格:" + m * 0.9);
        setMoney(getMoney() - m * 0.9);
    }



}
