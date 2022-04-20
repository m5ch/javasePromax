package Collections.set;

/**
 * @ Classname Apple
 * @ Description TODO
 * @ Date 2022/4/19 21:07
 * @ Created by 落尘
 */
public class Apple implements Comparable<Apple>{
    private String name;
    private String color;
    private double price;
    private int weight;

    public Apple() {
    }

    public Apple(String name, String color, double price, int weight) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}'
                +"\n";
    }


    /**
     * 方法一：类自定义比较规则
     * o1.copmpatreTo(o2)
     * @param o
     * @return int
     */
    @Override
    public int compareTo(Apple o) {
        //按重量比较
//        return this.weight - o.weight;    //去掉重量重复的元素
        return this.weight - o.weight >= 0 ? 1 :-1;     //保留重量重复的元素
    }
}
