package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ Classname Test04
 * @ Description TODO 收集Strea流的数据到集合或数组中
 * @ Date 2022/4/21 20:14
 * @ Created by 落尘
 */
public class Test04 {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        Collections.addAll(lists,"张三丰","张无忌","令狐冲","赵敏","东方不败","张强","张三丰");

        Stream<String> arr = lists.stream().filter(s -> s.startsWith("张"));
        //
//        List<String> zhangList = arr.collect(Collectors.toList());
//        System.out.println(zhangList);
        List<String> zhangList1 = arr.toList();     //得到不可变集合
        System.out.println(zhangList1);

        //注意注意注意：流只能使用一次

        Stream<String> arr1 = lists.stream().filter(s -> s.startsWith("张"));
        Set<String> zhangSet = arr1.collect(Collectors.toSet());
        System.out.println(zhangSet);

        //
        Stream<String> arr2 = lists.stream().filter(s -> s.startsWith("张"));
        Object[] array = arr2.toArray();
        System.out.println(Arrays.toString(array));

    }
}
