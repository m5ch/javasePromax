package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/**
 * @ Classname demo01
 * @ Description TODO 认识Map体系的特点：键：无序、不重复、无索引。值：不做要求
 * @ Date 2022/4/20 16:42
 * @ Created by 落尘
 */
public class demo01 {
    public static void main(String[] args) {
        //创建一个Map集合对象
        Map<String, Integer> maps = new HashMap<>();
        maps.put("Java",1);
        maps.put("HTmL",30);
        maps.put("Java",100);   //覆盖前面数据
        maps.put("CSS",40);
        maps.put(null,null);
        System.out.println(maps);

        System.out.println("================");

        Map<String, Integer> maps1 = new LinkedHashMap<>();     //有序
        maps1.put("Java",1);
        maps1.put("HTmL",30);
        maps1.put("Java",100);   //覆盖前面数据
        maps1.put("CSS",40);
        maps1.put(null,null);
        System.out.println(maps1);

    }
}
