package Extends.demo_3;

/**
 * 目标：理解继承的特点
 * 1.子类可以继承父类的属性和行为，但是子类不能继承父类的构造器。
 * 2.Java是单继承模式:一个类只能继承一个直接父类。
 * 3。Java不支持多继承、但是支持多层继承。
 * 4.Java中所有的类都是Object类的子类。
 */
public class test {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat();
        System.out.println(t.location);
    }
}

class Animal{
    public void eat(){
        System.out.println("=开饭了=");
    }
    public static String location = "动物园";
}

class Tiger extends Animal{

}
