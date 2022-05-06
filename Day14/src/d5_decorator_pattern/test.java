package d5_decorator_pattern;

/**
 * @ Classname Decorator_pattern
 * @ Description TODO
 * @ Date 2022/5/6 17:02
 * @ Created by 落尘
 */
public class test {
    public static void main(String[] args) {
        InputStream is = new BufferedInputStream(new FileInputStream());
        System.out.println(is.read());
        System.out.println(is.read(new byte[3]));
    }
}
