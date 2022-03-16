package Abstract.demo1;

//认识抽象类，了解使用场景

/**
 * 抽象方法只有方法签名，不能声明方法体。
 * 一个类中如果定义了抽象方法，这个类必须声明成抽象类，否则报错。
 */

public class demo1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.run();
    }
}
