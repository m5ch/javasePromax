package d4_factory_pattern;

/**
 * @ Classname Test
 * @ Description TODO
 * @ Date 2022/5/6 16:37
 * @ Created by 落尘
 */
public class Test {
    public static void main(String[] args) {
        Computer c1 = Factory_pattern.creatComputer("huawei");
        System.out.println(c1.getName());
        c1.start();

        Computer c2 = Factory_pattern.creatComputer("mac");
        System.out.println(c2.getName());
        c2.start();

    }
}
