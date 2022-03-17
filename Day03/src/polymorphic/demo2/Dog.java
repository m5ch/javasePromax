package polymorphic.demo2;

public class Dog extends Animal {

    @Override
    public void run() {
        System.out.println("狗狗会游泳");
    }

    public void look(){
        System.out.println("狗狗在看门");
    }
}
