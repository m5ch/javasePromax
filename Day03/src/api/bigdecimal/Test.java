package api.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c);
        System.out.println( "-----------------------");
        //包装浮点型数据成为大数据对象BigDeciaml
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        BigDecimal c1 = a1.add(b1);
        BigDecimal c2 = a1.subtract(b1);
        BigDecimal c3 = a1.multiply(b1);
        BigDecimal c4 = a1.divide(b1);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println("==============");
        /*
            注意1：转换为double类型
         */
        double rs = c1.doubleValue();
        System.out.println(c1);

        /*
            注意2：BigDecimal 一定要精度运算
         */
        BigDecimal x = BigDecimal.valueOf(10.0);
        BigDecimal y = BigDecimal.valueOf(3.0);
        BigDecimal z = x.divide(y, RoundingMode.HALF_UP);
        System.out.println(z);
    }
}
