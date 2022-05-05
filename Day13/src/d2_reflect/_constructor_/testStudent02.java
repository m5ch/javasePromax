package d2_reflect._constructor_;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * @ Classname testStudent02
 * @ Description TODO 使用反射技术获取构造器对象并使用
 * @ Date 2022/5/4 14:56
 * @ Created by 落尘
 */
public class testStudent02 {
    @Test
    public void getConstructor() throws Exception {
        //获取类对象
        Class c = Student.class;

        //提取类中的构造器对象
        Constructor constructor1 = c.getConstructor();
        System.out.println(constructor1.getName()+"==>"+constructor1.getParameterCount());

        //

        //如果遇到了私有的构造器，可以暴力反射
        constructor1.setAccessible(true);

        Student student1 = (Student) constructor1.newInstance();
        System.out.println(student1);

        Constructor constructor2 = c.getConstructor(String.class, int.class);
        Student student2 = (Student) constructor2.newInstance("张三",22);
        System.out.println(student2);


    }
}
