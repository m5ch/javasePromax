package Static.task_1;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.
        int[] s = {1,2,3,4,5,5,66,7,8};
        System.out.println(s);
        System.out.println(ArraysUtils.tosString(s));

        //2.
        int n = sc.nextInt();
        double[] st = new double[n];
        for (int i = 0; i < n; i++) {
            st[i] = sc.nextDouble();
        }
        double ave;
        ave = ArraysUtils.getAverage(st);
        System.out.println(ave);
    }
}
