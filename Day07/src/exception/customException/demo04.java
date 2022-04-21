package exception.customException;

/**
 * @ Classname demo04
 * @ Description TODO 自定义异常的分类
 * @ Date 2022/4/21 21:59
 * @ Created by 落尘
 */
public class demo04 {
    public static void main(String[] args) {
        /*
            定义一个异常类继承Exception.
            重写构造器。
            在出现异常的地方用throw new自定义对象抛出，
         */
        try {
            checkAge(199);
        } catch (AgeException e) {
            e.printStackTrace();
        }

        checkAge1(201);
    }

    private static void checkAge(int n) throws AgeException {
        if (n > 200 || n < 0){
            //抛出一个异常对象给调用者
            //throw:在方法内部直接创建一个异常对象，并从此抛出
            //throws:用在方法声明上的，抛出方法内部的异常
            throw new AgeException(n + " is 瞎搞~~");
        }
        else
            System.out.println("输入合法");
    }

    private static void checkAge1(int n){
        if (n > 200 || n < 0){
            //抛出一个异常对象给调用者
            //throw:在方法内部直接创建一个异常对象，并从此抛出
            //throws:用在方法声明上的，抛出方法内部的异常
            throw new AgeRunTimeException(n + " is 瞎搞~~");
        }
        else
            System.out.println("输入合法");
    }

}
