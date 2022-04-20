package Collections.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @ Classname demo01
 * @ Description TODO collections工具类的使用
 * @ Date 2022/4/20 13:53
 * @ Created by 落尘
 */
public class demo01 {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
//        lists.add("张三");
//        lists.add("李四");
//        lists.add("王五");
//        lists.add("小芳");

        Collections.addAll(lists,"张三","李四","王五","小芳");
        System.out.println(lists);
        System.out.println("=======================");

        //打乱集合顺序 List<E>
        Collections.shuffle(lists);
        System.out.println(lists);
        System.out.println("==================");

        //排序
        List<String> name = new ArrayList<>();
        Collections.addAll(name,"张三","李四","王五","小芳");
        Collections.sort(name);
        System.out.println(name);

        System.out.println("-------------------");
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("红富士","红色",12.3,600));
        apples.add(new Apple("蓝富士","蓝色",19.3,600));
        apples.add(new Apple("白富士","白色",16.9,300));
        apples.add(new Apple("绿富士","绿色",10.3,200));
        apples.add(new Apple("紫富士","紫色",22.4,1000));

        Collections.sort(apples);
        System.out.println(apples);

        Collections.sort(apples, new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return Double.compare(o1.getPrice() , o2.getPrice());
            }
        });
        System.out.println(apples);
    }
}
