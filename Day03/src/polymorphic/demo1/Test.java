package polymorphic.demo1;

//目标：认识多态，理解多态的形式和概念
/*
    多态中成员访问特点
    方法调用:编译看左边，运行看右边。
    变量调用:编译看左边，运行也看左边。(多态侧重行为多态)
 */
public class Test {
    public static void main(String[] args) {
        //1.多态的形式
        //父类类型 名称 = new 子类构造器
        Animal d = new Dog();
        d.run();

        Animal c = new Cat();
        c.run();
    }
}
