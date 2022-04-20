package Collections.set.task;

import java.util.HashSet;
import java.util.Set;

/**
 * @ Classname task
 * @ Description TODO
 * @ Date 2022/4/19 20:40
 * @ Created by 落尘
 */
public class task {
    public static void main(String[] args) {
        //set集合去重复步骤：先判断哈希值，在判断equals
        Set<Student> st = new HashSet<>();
        Student s1 = new Student("张三",20,"男");
        Student s2 = new Student("张三",20,"男");
        Student s3 = new Student("李四",24,"男");
        Student s4 = new Student("小芳",18,"女");

        st.add(s1);
        st.add(s2);
        st.add(s3);
        st.add(s4);

        System.out.println(st);
    }


}
