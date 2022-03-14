package Extends.demo_6;

//目标：认识继承后子类构造器的特点
//特点：子类的全部构造器默认会先访问父类的无参数构造器再执行自己
public class Test_1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        Dog d1 = new Dog( "小黑");

    }
}
