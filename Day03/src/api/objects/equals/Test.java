package api.objects.equals;

/**
 * 目标：掌握Objects.equals()
 */

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        String s1 = "ithema";
        String s2 = null;
        System.out.println(s1.equals(s2));
        System.out.println(Objects.equals(s1,s2));
//        public static boolean equals(Object a, Object b) {
//            return (a == b) || (a != null && a.equals(b));
//        }
    }
}
