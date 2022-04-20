package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ Classname demo04
 * @ Description TODO 遍历Map集合 方式二：键值对
 * @ Date 2022/4/20 19:22
 * @ Created by 落尘
 */
public class demo04 {
    public static void main(String[] args) {
        /*
            先把Map集合转换成Set集合，Set集合中每个元素都是键值对实体类型了。
            遍历Set集合，然后提取键以及提取值。
         */
        Map<String,Integer> maps = new HashMap<>();
        //1.添加元素
        maps.put("iphone",10);
        maps.put("oppo",20);
        maps.put("vivo",30);
        maps.put("huawei",40);
        maps.put("xiaomi",50);
        maps.put("huawei",100);

        System.out.println(maps);

        System.out.println("---------------------");

        //把map集合转换为set集合
        Set<Map.Entry<String, Integer>> entries = maps.entrySet();
        //遍历
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + "==>" + value);
        }

    }
}
