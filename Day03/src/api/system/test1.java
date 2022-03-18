package api.system;

import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        System.out.println("开始");
        //1. 终止进程
        //System.exit(0);     //JVM终止！！

        //2.计算时间
        long time = System.currentTimeMillis();
        System.out.println(time);

        //进行时间计算：性能分析
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println("输出" + i);
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0 + "s");

        //3.数组拷贝

        /**
         *  arraycopy(Object src,  int  srcPos,
         *  Object dest, int destPos,
         *  int length);
         *  参数一:被烤贝的数组
         * 参数二:从哪个索引位置开始拷贝参数三:复制的目标数组
         * 参数四:粘贴位置
         * 参数五:拷贝元素的个数
         */
        int[] arr1 = {10,20,30,40,50,60,70};
        int[] arr2 = new int[6];
        // [0，0，0，0，0，0] ==>[0，0，40，50，60，0]
        System.arraycopy(arr1,2,arr2,3,3);
        System.out.println(Arrays.toString(arr2));
    }
}
