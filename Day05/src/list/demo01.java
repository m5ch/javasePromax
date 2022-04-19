package list;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Classname demo01
 * @ Description TODO List常用API
 * @ Date 2022/4/18 19:46
 * @ Created by 落尘
 */
public class demo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("java");
        list.add("mybatis");
        list.add("mybatis");

        //在索引位置插入元素
        list.add(2,"html");
        list.add(2,"css");
        System.out.println(list);

        //根据索引删除元素，返回被删除元素
        System.out.println(list.remove(1));
        System.out.println(list);

        //根据索引获取元素
        System.out.println(list.get(3));

        //修改索引位置处的元素
        list.set(3,"maven");
        System.out.println(list);

    }
}
