package d2_dom4j;

/**
 * @ Classname Plant
 * @ Description TODO
 * @ Date 2022/5/6 13:52
 * @ Created by 落尘
 */

public class Food {

    /*
    <food>
        <name>Belgian Waffles</name>
        <price>$5.95</price>
        <description>Two of our famous Belgian Waffles with plenty of real maple syrup</description>
        <calories>650</calories>
    </food>
    */

    private String name;
    private String price;
    private String description;
    private double calories;

    public Food() {
    }

    public Food(String name, String price, String description, double calories) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", description='" + description + '\'' +
                ", calories=" + calories +
                '}';
    }
}
