package Collections.set;

import java.util.Set;
import java.util.TreeSet;

/**
 * @ Classname demo03
 * @ Description TODO TreeSet
 * @ Date 2022/4/19 20:55
 * @ Created by 落尘
 */
public class demo03 {
    public static void main(String[] args) {
        /*
            观察Treeset对于有值特性的数据如何排序。
            学会对自定义类型的对象进行指定规则排序
         */
        Set<Integer> sets = new TreeSet<>();    //不重复，可排序，无索引
        sets.add(23);
        sets.add(6);
        sets.add(98);
        sets.add(3);
        sets.add(12);
        System.out.println(sets);

        System.out.println("=====================");

        Set<String> sets1 = new TreeSet<>();    //不重复，可排序，无索引
        sets1.add("java");
        sets1.add("java");
        sets1.add("html");
        sets1.add("css");
        sets1.add("mysql");
        sets1.add("mysql");
        System.out.println(sets1);

        System.out.println("-------------------------");

        //集合自带比较器对象进行规则制定
        Set<Apple> apples = new TreeSet<>((o1, o2) -> {
//                return o2.getWeight() - o1.getWeight();
            return Double.compare(o1.getPrice(),o2.getPrice());
        });
        apples.add(new Apple("红富士","红色",12.3,600));
        apples.add(new Apple("蓝富士","蓝色",19.3,600));
        apples.add(new Apple("白富士","白色",16.9,300));
        apples.add(new Apple("绿富士","绿色",10.3,200));
        apples.add(new Apple("紫富士","紫色",22.4,1000));

        System.out.println(apples);
    }
}
