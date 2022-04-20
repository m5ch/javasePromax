package Collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @ Classname demo02
 * @ Description TODO LinkedHashSet
 * @ Date 2022/4/19 20:52
 * @ Created by 落尘
 */
public class demo02 {
    public static void main(String[] args) {
//        Set<String> sets = new HashSet<>();     //无序 不重复 无索引
        Set<String> sets = new LinkedHashSet<>();     //有序 不重复 无索引
        sets.add("Java");
        sets.add("HTML");
        sets.add("Java");
        sets.add("Mysql");
        sets.add("Mysql");
        sets.add("Springboot");
        sets.add("Springboot");

        System.out.println(sets);

    }
}
