package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @ Classname demo03
 * @ Description TODO Iterator迭代器
 * @ Date 2022/4/18 11:48
 * @ Created by 落尘
 */
public class demo03 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("q");
        list.add("w");
        list.add("e");
        list.add("r");
        list.add("t");

        /*
            迭代器是集合的专用遍历方式
         */
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String ele = it.next();
            System.out.println(ele);
        }
    }
}
