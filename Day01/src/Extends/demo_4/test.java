package Extends.demo_4;

/*
    理解继承后成员的访问特点：就近原则
 */
public class test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.run();    //子类的
        d.LookDoor();   //子类的

        d.showName();
    }
}

class Animal{
    String name = "父名";
    public void run(){
        System.out.println("动物可以跑");
    }
}

class Dog extends Animal{
    String name = "子名";
    public void run(){
        System.out.println("狗跑的很快~~");
    }

    public void LookDoor(){
        System.out.println("狗可以看门~~");
    }

    public void showName(){
        String name = "局部名";
        System.out.println(name);           //局部名
        System.out.println(this.name);      //子名
        System.out.println(super.name);     //父名
    }
}