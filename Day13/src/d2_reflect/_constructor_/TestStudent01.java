package d2_reflect._constructor_;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * @ Classname TestStudent01
 * @ Description TODO
 * @ Date 2022/5/4 14:21
 * @ Created by 落尘
 */
public class TestStudent01 {
    /*
        1. getConstructors
        获取全部的构造器,只能获取public修饰的构造器
     */
    @Test
    public void getConstructors(){
        //获取类对象
        Class c = Student.class;

        //提取类中的全部构造器对象
        Constructor[] constructors = c.getConstructors();

        //遍历构造器
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "==>" + constructor.getParameterCount());
        }
    }

    /*
        2. getDeclaredConstructors
        获取全部的构造器，只要你敢写，这里就能拿到，无所谓权限是否可及
     */
    @Test
    public void getDeclaredConstructors(){
        //获取类对象
        Class c = Student.class;

        //提取类中的全部构造器对象
        Constructor[] constructors = c.getDeclaredConstructors();

        //遍历构造器
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "==>" + constructor.getParameterCount());
        }
    }

    /*
        3.getConstructor(class...parameterTypes)
        获取某一个构造器:只能拿publicc修饰的某个构造器
     */
    @Test
    public void getConstructor() throws NoSuchMethodException {
        //获取类对象
        Class c = Student.class;

        //定位单个构造器对象
        Constructor constructor = c.getConstructor();

        System.out.println(constructor.getName()+"==>"+constructor.getParameterCount());
    }
    /*
        3.getConstructor(class...parameterTypes)
        获取某一个构造器:只能拿publicc修饰的某个构造器
     */
    @Test
    public void getDeclaredConstructor() throws NoSuchMethodException {
        //获取类对象
        Class c = Student.class;

        //定位单个构造器对象
        Constructor constructor = c.getDeclaredConstructor(String.class ,int.class);

        System.out.println(constructor.getName()+"==>"+constructor.getParameterCount());
    }


}
