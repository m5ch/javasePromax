package Interface.demo3;

//目标：理解接口多继承的特点和作用
public class Test {
    public static void main(String[] args) {
        FootballMan f = new FootballMan("leo");
        f.eat();
        f.sleep();
        f.run();
        f.competition();
        f.law();
    }
}
