package innerclass.demo3;

public class Test2 {
    public static void main(String[] args) {
        //1.
        Sport s1 = new Sport() {
            @Override
            void run() {
                System.out.println("学生跑的很快~~");
            }
        };
        go(s1);
        System.out.println("============");
        Sport s2 = new Sport() {
            @Override
            void run() {
                System.out.println("老师跑的更快~~");
            }
        };
        go(s2);
        System.out.println("==============");
        //3.
        go(new Sport() {
            @Override
            void run() {
                System.out.println("运动员跑的超级快~~");
            }
        });
    }

    public static void go(Sport sport){
        System.out.println("开始~~");
        sport.run();
        System.out.println("结束~~");
    }
}

abstract class Sport{
    abstract void run();
}
