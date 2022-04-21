package stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * @ Classname Test02
 * @ Description TODO 集合、数组获取流
 * @ Date 2022/4/21 15:46
 * @ Created by 落尘
 */
public class Test02 {
    public static void main(String[] args) {
        //-----------------Collection集合获取流-------------------
        Collection<String> lists = new ArrayList<>();
        Collections.addAll(lists,"张三","李四","王五");
        Stream<String> listStream = lists.stream();
        listStream.forEach(s -> System.out.println(s));

        //-----------------Map集合获取流-------------------
        Map<String,Integer> maps = new HashMap<>();
        maps.put("java",100);
        maps.put("html",500);
        maps.put("css",1000);
        // 获取键
        Set<String> keys = maps.keySet();
        Stream<String> keyStream = keys.stream();
        // 获取值
        Stream<Integer> valueStream = maps.values().stream();
        // 获取键
        Stream<Map.Entry<String, Integer>> entries = maps.entrySet().stream();
        entries.forEach(s -> System.out.println(s));

        //-----------------数组获取流-------------------
        String[] arr = {"张三","李四","王五"};
        Stream<String> arrStream1 = Arrays.stream(arr);
        //
        Stream<String> arrStream2 = Stream.of(arr);
        arrStream2.forEach(s -> System.out.println(s));
    }
}
