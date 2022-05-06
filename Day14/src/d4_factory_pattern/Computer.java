package d4_factory_pattern;

/**
 * @ Classname Computer
 * @ Description TODO
 * @ Date 2022/5/6 16:28
 * @ Created by 落尘
 */
public class Computer {
    private String name;
    private double price;

    public Computer() {
    }

    public Computer(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void start(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
