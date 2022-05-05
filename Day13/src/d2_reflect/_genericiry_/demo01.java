package d2_reflect._genericiry_;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @ Classname demo01
 * @ Description TODO
 * @ Date 2022/5/4 17:03
 * @ Created by 落尘
 */
public class demo01 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        System.out.println(list1.getClass());
        System.out.println(list2.getClass());
        System.out.println(list1.getClass().equals(list2.getClass()));

        System.out.println("===========================");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(12);
        list3.add(98);
//        list3.add("张三");
        Class c = ArrayList.class;
        Method method = c.getMethod("add",Object.class);
        boolean rs = (boolean) method.invoke(list3,"张三");
        System.out.println(rs);
        System.out.println(list3);

        System.out.println("====================");
        ArrayList list4 = list3;
        list4.add("李四");
        list4.add(false);
        System.out.println(list3);

    }
}
