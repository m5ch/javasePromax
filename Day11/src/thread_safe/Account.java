package thread_safe;

/**
 * @ Classname Account
 * @ Description TODO 模拟账户类
 * @ Date 2022/4/28 16:44
 * @ Created by 落尘
 */
public class Account {
    private String name;
    private double money;

    public Account() {
    }

    public Account(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void DrawMoney(double money) {
        //0.先获取谁来取钱，线程的名字就是人名
        String m = Thread.currentThread().getName();
        //1.判断余额是否够
        if (this.money >= money){
            //
            System.out.println(m+"取钱成功:"+money);
            //
            this.money -= money;
            System.out.println(m+"取钱后，剩余："+this.money);
        }else{
            System.out.println(m + "来取钱，余额不足！！");
        }

    }
}
