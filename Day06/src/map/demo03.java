package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ Classname demo03
 * @ Description TODO 遍历Map集合 方式一：键找值
 * @ Date 2022/4/20 17:20
 * @ Created by 落尘
 */
public class demo03 {
    public static void main(String[] args) {
        /*
            先获取Map集合的全部键的Set集合。
            遍历键的Set集合，然后通过键提取对应值。
         */
        Map<String,Integer> maps = new HashMap<>();
        //添加元素
        maps.put("iphone",10);
        maps.put("oppo",20);
        maps.put("vivo",30);
        maps.put("huawei",40);
        maps.put("xiaomi",50);
        maps.put("huawei",100);

        System.out.println(maps);

        System.out.println("---------------------");

        //拿到集合的全部键
        Set<String> keys = maps.keySet();
        //遍历每个键，根据键提取值
        for (String key : keys) {
            int value = maps.get(key);
            System.out.println(key + "==>" + value);
        }

    }
}
