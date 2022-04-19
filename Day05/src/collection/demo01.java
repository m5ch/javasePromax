package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * @ Classname demo01
 * @ Description TODO   Collection集合的特点
 * @ Date 2022/4/16 19:22
 * @ Created by 落尘
 */
public class demo01 {
    public static void main(String[] args) {
        //有序。可重复。有索引
        Collection list = new ArrayList();
        list.add("java");
        list.add("java");
        list.add("mybatis");
        list.add(123);
        System.out.println(list);

        //无序 不重复 无索引

        Collection list1 = new HashSet();
        list1.add("java");
        list1.add("java");
        list1.add("mybatis");
        list1.add(123);
        list1.add(false);
        list1.add(false);
        System.out.println(list1);

        System.out.println("++++++++++++++++++++++++");
        Collection<String> list2 = new ArrayList<>();
        list2.add("hello");
        list2.add("hello");
        //list2.add(1234);
        System.out.println(list2);

        //集合＆泛型不支持基本数据类型，只能支持应用数据类型
        Collection<Integer> list3 = new ArrayList<>();
        list3.add(123);
        list3.add(13);
        list3.add(12);
        System.out.println(list3);
    }
}
