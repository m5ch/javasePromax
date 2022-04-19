package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/**
 * @ Classname demo05
 * @ Description TODO Lambda表达式遍历集合
 * @ Date 2022/4/18 15:21
 * @ Created by 落尘
 */
public class demo05 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("q");
        list.add("w");
        list.add("e");
        list.add("r");
        list.add("t");

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("=================");
        list.forEach(s -> System.out.println(s));

        System.out.println("=================");

        list.forEach(System.out::println);
    }
}
