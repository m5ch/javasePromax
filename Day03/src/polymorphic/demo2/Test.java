package polymorphic.demo2;

//目标：认识多态的优略势，以及转换
/*
    自动类型转换（从子到父):子类对象赋值给父类类型的变量指向。
    强制类型转换吗（从父到子)
    此时必须进行强制类型转换:子类对象变量=(子类)父类类型的变量
    作用:可以解决多态下的劣势，可以实现调用子类独有的功能。
    注意:如果转型后的类型和对象真实类型不是同一种类型，那么在转换的时候就会出现ClassCastException

    Java建议强转转换前使用instanceof判断当前对象的真实类型，再进行强制转换
    变量名 instanceof 真实类型
    判断关键字左边的变量指向的对象的真实类型，是否是右边的类型或者是其子类类型，是则返回true，反之。

 */
public class Test {
    public static void main(String[] args) {
        //自动类型转换
        Animal d = new Dog();
        d.run();
        //强制类型转换， 子类 变量名 = (子类)父类变量名
        Dog d1 = (Dog) d;
        d1.look();
        System.out.println("=============");

        Animal c = new Cat();
        c.run();

        //变量名 instanceof 真实类型
        if (c instanceof Cat){
            Cat c2 = (Cat)c;
            c2.eat();
        }
        else if (c instanceof Dog){
            Dog c2 = (Dog)c;
            c2.look();
        }
    }
}
