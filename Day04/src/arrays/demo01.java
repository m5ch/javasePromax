package arrays;

import java.util.Arrays;

/**
 * @ Classname demo01
 * @ Description Ararys常用API
 * @ Date 2022/4/15 10:19
 * @ Created by 落尘
 */
public class demo01 {
    public static void main(String[] args) {

        //返回数组内容
        int[] a = {1,4,33,7,94,2,5};
        System.out.println(Arrays.toString(a));

        //排序(默认升序排序)
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        //二分搜索(前提是必须排好序才可以，否则出bug)
        int index = Arrays.binarySearch(a,7);
        System.out.println(index);
        //返回不存在元素的规律：  -（应该插入的位置索引+1）
        int index1 = Arrays.binarySearch(a,100);
        System.out.println(index1);
    }
}
