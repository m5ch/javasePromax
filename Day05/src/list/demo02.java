package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @ Classname demo02
 * @ Description TODO List遍历
 * @ Date 2022/4/18 19:58
 * @ Created by 落尘
 */
public class demo02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("q");
        list.add("w");
        list.add("e");
        list.add("r");
        list.add("t");

        //for循环
        for (int i = 0; i < list.size(); i++) {
            String ele = list.get(i);
            System.out.println(ele);
        }

        System.out.println("--------------------");

        //迭代器
        Iterator<String> its = list.iterator();
        while(its.hasNext()){
            String ele = its.next();
            System.out.println(ele);
        }

        System.out.println("===============");
        //增强for循环（forEach）
        for(String s : list){
            System.out.println(s);
        }

        System.out.println("==================");

        //Lambda表达式
        list.forEach(s -> System.out.println(s));
    }
}
