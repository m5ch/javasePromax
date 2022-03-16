package Abstract.demo2;

public class GoldCard extends Card{

    @Override
    public void pay(double money) {
        System.out.println("当前消费："+ money);
        double rs = money * 0.8;
        System.out.println("折后" + rs);
        setMoney(getMoney() - rs);
    }
}
