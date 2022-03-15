package Final;

import org.w3c.dom.ls.LSOutput;

/**
 * 目标：明白final的一些基本语法知识
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 3.fianl修饰变量，变量有且仅有一次能被赋值
         */
        final int age;
        age = 22;
//        age = 18;   //第二次赋值，报错
    }
}


/**
 * 1.final修饰类，类不能被继承
 */
final class Animal{

}
//无法从final 'Final.Animal' 继承
//class Cat extends Animal{
//
//}

/**
 * 2.final修饰方法，方法不能被重写
 */

class People{
    public final void run(){
        System.out.println("人会跑");
    }
}

class Student extends People{
//    重写的方法为 final
//    @Override
//    public void run() {
//        super.run();
//    }
}