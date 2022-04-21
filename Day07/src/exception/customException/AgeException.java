package exception.customException;

/**
 * @ Classname AgeException
 * @ Description TODO
 * @ Date 2022/4/21 22:03
 * @ Created by 落尘
 */
public class AgeException extends Exception{
    /*
        自定义编译时异常
        1.继承Exveption
        2.重写构造器
     */

    public AgeException() {
    }

    public AgeException(String message) {
        super(message);
    }
}
