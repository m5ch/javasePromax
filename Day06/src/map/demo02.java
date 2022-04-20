package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ Classname demo02
 * @ Description TODO Map常用API
 * @ Date 2022/4/20 17:00
 * @ Created by 落尘
 */
public class demo02 {
    public static void main(String[] args) {
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

        //2.清空集合
//        maps.clear();
//        System.out.println(maps);

        //3.判断是否为空
        System.out.println(maps.isEmpty());

        //4.根据键获取对应值,没有泽返回null
        Integer value = maps.get("huawei");
        System.out.println(value);

        //5.根据键删除整个元素（返回键的值）
        System.out.println(maps.remove("iphone"));
        System.out.println(maps);

        //6.判断是否包含某个键，返回true或false
        System.out.println(maps.containsKey("huawei"));
        System.out.println(maps.containsKey("iphone"));

        //6.判断是否包含某个值，返回true或false
        System.out.println(maps.containsValue(100));
        System.out.println(maps.containsValue(1000));

        //8.获取全部键的集合
        Set<String> keys = maps.keySet();
        System.out.println(keys);

        //9.获取全部值的集合

        Collection<Integer> values = maps.values();
        System.out.println(values);

        //10.集合的大小
        System.out.println(maps.size());

        //11.合并其他map集合
        Map<String,Integer> maps1 = new HashMap<>();
        maps1.put("java",10);
        maps1.put("HTML",78);
        maps1.put("CSS",900);
        maps.putAll(maps1);
        System.out.println(maps1);
        System.out.println(maps);


    }
}
