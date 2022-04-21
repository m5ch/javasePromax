package exception.customException;

/**
 * @ Classname AgeException
 * @ Description TODO
 * @ Date 2022/4/21 22:03
 * @ Created by 落尘
 */
public class AgeRunTimeException extends RuntimeException{
    /*
        自定义运行时异常
        1.继承RuntimeExveption
        2.重写构造器
     */

    public AgeRunTimeException() {
    }

    public AgeRunTimeException(String message) {
        super(message);
    }
}
