package Abstract.demo2;

public abstract class Card {
    private String name;
    private Double money;

    public abstract void pay(double money);



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
