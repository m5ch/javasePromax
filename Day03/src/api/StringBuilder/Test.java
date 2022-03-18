package api.StringBuilder;

/**
 * 目标：理解Stringbuilder
 */
public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append(true);
        sb.append("qwer");
        sb.append(123);
        System.out.println(sb);

        //支持链式编程
        StringBuilder sb1 = new StringBuilder();
        sb1.append("我").append("爱").append("你").append("中国");
        System.out.println(sb1);

        // 反转
        sb1.reverse().append(111);
        System.out.println(sb1);

        /**
         * 注意：StringBuilder只是拼接字符串的手段，效率好
         * 最终目的还是要恢复成String类型
         */
        StringBuilder sb2 = new StringBuilder();
        sb2.append(123).append(987);
        //恢复成String类型
        String rs = sb2.toString();
        check(rs);

    }

    private static void check(String rs) {
        System.out.println(rs);
    }
}

