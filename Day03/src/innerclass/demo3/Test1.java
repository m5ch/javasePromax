package innerclass.demo3;

public class Test1 {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.run();
        System.out.println("=============");
        Animal c = new Animal(){
            @Override
            public void run(){
                System.out.println("猫猫也跑的很快~~");
            }
        };
        c.run();
    }

}
abstract class Animal{
    public abstract void run();
}

class Dog extends Animal{

    @Override
    public void run() {
        System.out.println("狗狗跑得快~~");
    }
}
