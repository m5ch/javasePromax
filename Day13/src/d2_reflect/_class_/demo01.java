package d2_reflect._class_;

/**
 * @ Classname demo01
 * @ Description TODO
 * @ Date 2022/5/3 16:21
 * @ Created by 落尘
 */
public class demo01 {
    public static void main(String[] args) throws Exception {
        //1. Class类中的一个静态方法：forName(包名 + 类名)
        Class c1 = Class.forName("d2_reflect._class_.Student");
        System.out.println(c1);

        //2.类名.class
        Class c2 = Student.class;
        System.out.println(c2);

        //3.对象.getClass() 获取对象对应类的class对象
        Student student = new Student();
        Class c3 = student.getClass();
        System.out.println(c3);
    }
}
