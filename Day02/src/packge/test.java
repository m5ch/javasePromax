package packge;

import packge.demo1.Cat;

/**
 * import 包名.类名
 * 导包：相同包下的类可以直接访问，不同包下的类需要导包才能访问
 * 假如一个类中需要用到不同类，而这个两个类的名称是一样的，那么默认只能导入一个类，另一个类要带包名访问。
 */
public class test {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.run();
        System.out.println("===========");
        packge.demo2.Cat c2 = new packge.demo2.Cat();
        c2.run();
    }
}
