package d5_decorator_pattern;

/**
 * @ Classname InputStream
 * @ Description TODO 共同父类
 * @ Date 2022/5/6 17:02
 * @ Created by 落尘
 */
public abstract class InputStream {
    public abstract int read();
    public abstract int read(byte[] buffer);
}
