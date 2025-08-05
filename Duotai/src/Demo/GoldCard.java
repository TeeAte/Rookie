package Demo;
//存的方法一样，消费要打八折
public class GoldCard extends card{
    public GoldCard(String id, String name, String phone, double money) {
        super(id,name,phone,money);
    }

    @Override
    public void consume(double m) {
        System.out.println("您当前消费:" + m);
        System.out.println("优惠最后的价格:" + m * 0.8);
        setMoney(getMoney() - m * 0.8);
        if (m * 0.8 >= 200) {
            System.out.println("消费大于两百，打印洗车票");
        }
    }}
