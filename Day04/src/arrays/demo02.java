package arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ Classname demo02
 * @ Description 自定义数组的排序规则：Comparator比较器对象
 * @ Date 2022/4/15 11:03
 * @ Created by 落尘
 */
public class demo02 {
    public static void main(String[] args) {
        //1.Arrays的sort方法对于有值的特性的数组是默认升序排序


        //2.降序排序

        Integer[] arr = {23,18,5,30,70,42};
        /*
            参数一:被排序的数组必须是引用类型的元素
            参数二:匿名内部类对象，代表了一个比较器对象。
         */
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //制定比较规则
                return o2 - o1;
            }
        });

        System.out.println(Arrays.toString(arr));

        System.out.println("++++++++++++++++");

        Student[] students = new Student[3];
        students[0] = new Student("leo",22,185.2);
        students[1] = new Student("jack",24,177.6);
        students[2] = new Student("rose",18,168.3);

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//                return o1.getAge() - o2.getAge();
                //比较浮点型必须这样写
                return Double.compare(o2.getHeight(),o1.getHeight());
            }
        });
        System.out.println(Arrays.toString(students));
    }
}
