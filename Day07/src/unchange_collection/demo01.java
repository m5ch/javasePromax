package unchange_collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @ Classname demo
 * @ Description TODO 创建不可变集合
 * @ Date 2022/4/21 14:49
 * @ Created by 落尘
 */
public class demo01 {
    /*
        定义完成后不可以添加、修改、删除
     */
    public static void main(String[] args) {
        //list集合
        List<Integer> lists = List.of(12,34,56,78);
        System.out.println(lists);

        System.out.println("=================");

        //set集合
        Set<String> sets = Set.of("java","html","css");
        System.out.println(sets);

        System.out.println("=================");

        //map集合
        Map<String, Integer> maps = Map.of("huawei",100,"xiaomi",50);
        System.out.println(maps);
    }
}
