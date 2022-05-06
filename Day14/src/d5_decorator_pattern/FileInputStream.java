package d5_decorator_pattern;

import java.util.Arrays;

/**
 * @ Classname FileInputStream
 * @ Description TODO 原始类
 * @ Date 2022/5/6 17:04
 * @ Created by 落尘
 */
public class FileInputStream extends InputStream{

    @Override
    public int read() {
        System.out.println("低性能的方式读取了一个字节a");
        return 97;
    }

    @Override
    public int read(byte[] buffer) {
        buffer = new byte[]{'1', '2','3'};
        System.out.println("低性能的方式读取了一个字节数组" + Arrays.toString(buffer));
        return 3;
    }
}
