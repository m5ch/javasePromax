package Static.demo_3;

//目标：理解static访问相关的语法
//面试笔试题，或者以后理解程序很重要的知识

/*
    静态方法只能访问静态的成员，不可以直接访问实例成员。
    实例方法可以访问静态的成员，也可以访问实例成员。
    静态方法中是不可以出现this关键字的。
 */
public class Test {

    //静态成员变量
    public static int a = 29;
    //静态成员方法
    public static void test1(){
        System.out.println("=====test1====");
    }

    //实例成员变量
    private int b = 9;
    //实例成员方法
    private void run(){
        System.out.println(b + "跑得快");
    }
    //1.静态方法只能访问静态成员，不能”直接“访问实例成员
    public static void test2(){
        System.out.println(a);
        System.out.println(Test.a);
        test1();
        //不能直接访问实例成员
        //System.out.println(b);
        //run();
    }

    //2.实例方法可以访问静态成员，也可以访问实例成员

    public void go(){
        System.out.println(a);
        System.out.println(Test.a);
        test1();
        System.out.println(b);
        run();
    }

    //3.静态方法中不可以出现this关键字
    public static void test3(){
        //System.out.println(this);   //this只能代表当前对象！！
    }
    public static void main(String[] args) {

    }
}
