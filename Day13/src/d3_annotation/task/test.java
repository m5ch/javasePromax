package d3_annotation.task;

import java.lang.reflect.Method;

/**
 * @ Classname test
 * @ Description TODO 模拟JUnit框架
 * @ Date 2022/5/4 21:12
 * @ Created by 落尘
 */
public class test {
    /*
        启动菜单：有注解的才被调用
     */
    public static void main(String[] args) throws Exception {
        test t = new test();
        //获取类对象
        Class c = test.class;

        //提取全部方法
        Method[] methods = c.getDeclaredMethods();

        //遍历方法看是否有该注解
        for (Method method : methods) {
            if (method.isAnnotationPresent(Mytest.class)){
                //跑他
                method.invoke(t);
            }
        }

    }

    @Mytest
    public void fun1(){
        System.out.println("test1");
    }

    public void fun2(){
        System.out.println("test2");

    }

    @Mytest
    public void fun3(){
        System.out.println("test3");

    }
}
