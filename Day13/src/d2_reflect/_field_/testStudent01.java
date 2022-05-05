package d2_reflect._field_;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * @ Classname testStudent01
 * @ Description TODO 获取成员变量
 * @ Date 2022/5/4 15:15
 * @ Created by 落尘
 */
public class testStudent01 {
    /*
        1.Field[] getDeclaredFields();
        获取全部的成员变量
     */
    @Test
    public void getDeclaredFields(){
        //定位Class对象
        Class c = Student.class;

        //定位成员变量
        Field[] fields = c.getDeclaredFields();

        for (Field field : fields) {
            System.out.println(field.getName() + "==>" + field.getType());
        }
    }


    /*
        2.Field getDeclaredField(Object o)
        定位某个成员变量
     */
    @Test
    public void getDeclaredField() throws Exception {
        //
        Class c = Student.class;

        //根据名称定位某个成员变量
        Field field = c.getDeclaredField("name");
        System.out.println(field.getName()+"==>"+field.getType());
        field.setAccessible(true);

        //赋值
        Student s = new Student();
        field.set(s,"张三");
        System.out.println(s);

        //取值
        String st = (String) field.get(s);
        System.out.println(st);
    }
}
