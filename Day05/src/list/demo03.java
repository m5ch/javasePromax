package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @ Classname demo03
 * @ Description TODO 遍历并删除
 * @ Date 2022/4/18 20:22
 * @ Created by 落尘
 */
public class demo03 {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("q");
        lists.add("w");
        lists.add("e");
        lists.add("r");
        lists.add("t");

        //迭代器遍历
        Iterator<String> iterator = lists.iterator();
        while(iterator.hasNext()){
            String ele = iterator.next();
            if("java".equals(ele)){
                lists.remove(ele);  //有bug
                iterator.remove();  //不会后移
            }
        }
        System.out.println(lists);

        //forEach
        for (String s : lists) {
            if ("java".equals(s))
                lists.remove(s);
        }
        System.out.println(lists);

        //Lambda表达式
        lists.forEach(s -> {
            if("java".equals(s)){
                lists.remove(s);
            }
        });
        System.out.println(lists);

        //for循环 (倒着遍历或自减才行)
        for (int i = 0; i < lists.size(); i++) {
            String ele = lists.get(i);
            if("java".equals(ele)){
                lists.remove(ele);
                i--;
            }
        }
        System.out.println(lists);
    }



}
