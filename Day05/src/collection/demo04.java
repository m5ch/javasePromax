package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ Classname demo04
 * @ Description TODO 增强for循环
 * @ Date 2022/4/18 11:53
 * @ Created by 落尘
 */
public class demo04 {
    public static void main(String[] args) {
        /*
            增强for循环:既可以遍历集合也可以遍历数组。
            它是JDK5之后出现的，其内部原理是一个lterator迭代器，遍历集合相当于是迭代器的简化写法。
            实现lterable接口的类才可以使用迭代器和增强for，Collection接口已经实现了lterable接口。
         */
        Collection<String> list = new ArrayList<>();
        list.add("q");
        list.add("w");
        list.add("e");
        list.add("r");
        list.add("t");
        for (String ele:list
             ) {
            System.out.println(ele);
        }
    }
}
