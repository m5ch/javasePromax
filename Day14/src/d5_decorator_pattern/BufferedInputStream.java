package d5_decorator_pattern;

/**
 * @ Classname BufferdInputStream
 * @ Description TODO 装饰类，拓展原始类功能
 * @ Date 2022/5/6 17:13
 * @ Created by 落尘
 */
public class BufferedInputStream extends InputStream{
    private InputStream is;
    public BufferedInputStream(InputStream is){
        this.is = is;
    }
    @Override
    public int read() {
        System.out.println("提供8kb缓冲区，提高读写性能");
        return is.read();
    }

    @Override
    public int read(byte[] buffer) {
        System.out.println("提供8kb缓冲区，提高读写性能");
        return is.read(buffer);
    }
}
