package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ Classname Test01
 * @ Description TODO 初步体验stream流
 * @ Date 2022/4/21 15:03
 * @ Created by 落尘
 */
public class Test01 {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        Collections.addAll(lists,"张三丰","张无忌","令狐冲","赵敏","东方不败","张强");

        List<String> zhang = new ArrayList<>();
        for (String list : lists) {
            if (list.startsWith("张"))
                zhang.add(list);
        }

        List<String> three = new ArrayList<>();
        for (String s : zhang) {
            if(s.length() == 3)
                three.add(s);
        }

        System.out.println(three);


        //=====================================
        //stream流
        lists.stream().filter(s ->s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));


    }
}
