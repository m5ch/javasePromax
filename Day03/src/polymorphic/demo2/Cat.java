package polymorphic.demo2;

public class Cat extends Animal {

    @Override
    public void run() {
        System.out.println("猫可以上树");
    }

    public void eat(){
        System.out.println("猫猫在吃鱼");
    }
}
