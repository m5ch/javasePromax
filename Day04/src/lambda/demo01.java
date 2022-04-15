package lambda;

/**
 * @ Classname demo01
 * @ Description TODO 使用lambda的标准格式简化匿名内部类的代码格式
 * @ Date 2022/4/15 17:07
 * @ Created by 落尘
 */
public class demo01 {
    public static void main(String[] args) {
        /*
            注意:Lambda表达式只能简化函数式接口的匿名内部类的写法形式

            1、首先必须是接口、其次接口中有且仅有一个抽象方法的形式
            2、通常我们会在接口上加上一个@FunctionalInterface注解，标记该接口必须是满足函数式接口。

         */

//        Swim s1 = new Swim() {
//            @Override
//            public void swim() {
//                System.out.println("老师游泳很快");
//            }
//        };
//        go(s1);

        Swim s1 = () -> System.out.println("老师游泳很快");
        go(s1);

        System.out.println("=============");

        go(() -> System.out.println("学生游泳很开心"));
    }

    public static void go(Swim s){
        System.out.println("开始");
        s.swim();
        System.out.println("结束");
    }
}

@FunctionalInterface    //一旦加上这个注解必须是函数式接口，里面只有一个抽象方法
interface Swim{
    void swim();
}
