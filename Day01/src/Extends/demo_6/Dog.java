package Extends.demo_6;

public class Dog extends Animal{
    public Dog() {
        super();    //写不写都有，默认找父类的构造器并执行
        System.out.println("子类Dog无参数构造器被执行");
    }

    public Dog(String name){
        System.out.println("子类Dog有参数构造器被执行");
    }
}
