package d2_reflect._method_;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * @ Classname testDogdemo01
 * @ Description TODO
 * @ Date 2022/5/4 16:15
 * @ Created by 落尘
 */
public class testDogdemo01 {
    @Test
    public void getDeclaredMethod(){
        //
        Class c = Dog.class;

        //
        Method[] methods = c.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method.getName()+"==>"+method.getReturnType());
        }
    }

    @Test
    public void getDeclareMethod() throws Exception {
        //
        Class c = Dog.class;

        //
        Method method1 = c.getDeclaredMethod("run");
        Method method2 = c.getDeclaredMethod("eat", String.class);

        method1.setAccessible(true);
        method2.setAccessible(true);

        //触发方法的执行
        Dog d = new Dog();
        //注意：方法如果没有返回结果，那么返回的是null

        Object result =  method1.invoke(d);
        System.out.println(result);

        Object result2 =  method2.invoke(d,"骨头");
        System.out.println(result2);

    }
}
