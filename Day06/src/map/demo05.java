package map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * @ Classname demo05
 * @ Description TODO 遍历Map集合 方式三：Lambda表达式
 * @ Date 2022/4/20 19:31
 * @ Created by 落尘
 */
public class demo05 {
    public static void main(String[] args) {
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

//        maps.forEach(new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String key, Integer value) {
//                System.out.println(key+ "-->" +value);
//            }
//        });

        maps.forEach((key, value) -> System.out.println(key + "-->" + value));
    }
}
