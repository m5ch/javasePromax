package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * @ Classname Test03
 * @ Description TODO Stream流常用API
 * @ Date 2022/4/21 16:34
 * @ Created by 落尘
 */
public class Test03 {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        Collections.addAll(lists,"张三丰","张无忌","令狐冲","赵敏","东方不败","张强","张三丰");

        //filter:过滤元素
        lists.stream().filter(s -> s.startsWith("张")).forEach(System.out::println);
        System.out.println("=====================");

        //forEach:逐一处理（终结方法）
        lists.stream().forEach(System.out::println);
        System.out.println("=======================");

        //count:计数 （必须用 long类型来接）（终结方法）
        long con = lists.stream().filter(s -> s.length() == 3).count();
        System.out.println(con);
        System.out.println("================= ===========");

        //提取前几个元素
        lists.stream().filter(s -> s.startsWith("张")).limit(2).forEach(System.out::println);
        System.out.println("===================");

        //skip跳过前几个元素
        lists.stream().filter(s -> s.startsWith("张")).skip(2).forEach(System.out::println);
        System.out.println("========================");

        //去重复
        lists.stream().distinct().forEach(System.out::println);
        System.out.println("=========================");

        /*
            map加工方法
         */

        //1.给集合元素的前面都加上”Hello “
        lists.stream().map(s -> "Hello " + s).forEach(System.out::println);
        System.out.println("====================");

        //2.把所有的名称都加工成学生对象
//        lists.stream().map(s -> new Student(s)).forEach(System.out::println);
        lists.stream().map(Student::new).forEach(System.out::println);
        System.out.println("==========================");

        //合并流
        Stream<String> s1 = lists.stream().filter(s -> s.startsWith("张"));
        Stream<String> s2 = Stream.of("java","html","css");
        Stream<String> s3 = Stream.concat(s1,s2);
        s3.forEach(System.out::println);

    }
}
