package Final;

public class Test2 {
    public static void main(String[] args) {
        /**
         * final修饰变量的注意
         * 1.final修饰的变量是基本类型:那么变量存储的数据值不能发生改变。
         * 2.final修饰的变量是引用类型:那么变量存储的地址值不能发生改变，但是地址指向的对象内容是可以发生变化的。
         */
        final String s = "🚹";
//        s = "🚺";      //第二次赋值，报错

        System.out.println(s);
        System.out.println("==============");
        final int[]  a = {10,2,50};
        System.out.println(a);
        a[2] = 900;
        System.out.println(a);
        System.out.println(a[2]);
    }
}
