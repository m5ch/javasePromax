package Abstract.demo2;

public class Test {
    public static void main(String[] args) {
        GoldCard c = new GoldCard();
        c.setMoney(10000.0);
        System.out.println("当前余额：" + c.getMoney());
        c.pay(200);

        System.out.println("剩余" + c.getMoney());
    }
}
