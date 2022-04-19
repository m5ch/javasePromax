package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @ Classname demo02
 * @ Description TODO Collection常用API
 * @ Date 2022/4/18 11:12
 * @ Created by 落尘
 */
public class demo02 {
    public static void main(String[] args) {
        //HashSet:添加的元素是无序，不重复，无索引。/
        Collection<String> list = new ArrayList<>();
        // /1.添加元素，添加成功返回true。
        list.add("java");
        list.add("python");
        list.add("html");
        list.add("java");
        System.out.println(list);

        //2.清空集合的元素。
//        list.clear();
//        System.out.println(list);

        //3.判断集合是否为空是空返回true，反之。
        System.out.println(list.isEmpty());

        //4.获取集合的大小。
        System.out.println(list.size());

        //5.判断集合中是否包含某个元素。
        System.out.println(list.contains("java"));
        System.out.println(list.contains("Java"));

        // 6.删除某个元素:如果有多个重复元素默认删除前面的第一个!
        System.out.println(list.remove("java"));
        System.out.println(list);

        //7.把集合转换成数组[Java,独孤求败，HTML，Mybatis]。
        Object[] arr = list.toArray();
        System.out.println("数组:" + Arrays.toString(arr));

        System.out.println("==============拓展===================");
        Collection<String> c1 = new ArrayList<>();
        Collection<String> c2 = new ArrayList<>();

        c1.add("java");
        c1.add("黑马");
        c1.add("hello");
        c1.add("白马");
        c1.addAll(c2);
        System.out.println(c1);

    }
}
