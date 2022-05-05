package d2_reflect._method_;

/**
 * @ Classname Dog
 * @ Description TODO
 * @ Date 2022/5/4 16:10
 * @ Created by 落尘
 */
public class Dog {
    private String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(){
        System.out.println("狗狗跑得快");
    }

    public void eat(String name){
        System.out.println("狗狗吃"+name+"和开心");
    }

}
