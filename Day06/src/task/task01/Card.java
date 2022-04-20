package task.task01;

/**
 * @ Classname Card
 * @ Description TODO
 * @ Date 2022/4/20 14:40
 * @ Created by 落尘
 */
public class Card {
    private String size;
    private String color;
    private int index;

    public Card() {
    }

    public Card(String size, String color, int index) {
        this.size = size;
        this.color = color;
        this.index = index;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color + size;
    }


}
