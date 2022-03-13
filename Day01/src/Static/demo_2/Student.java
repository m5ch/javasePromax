package Static.demo_2;

public class Student {
    /*
        实例成员变量：无static修饰，属于对象
     */
    private String name;
    private int age;

    //静态成员方法:有static修饰，归属于类，可以共享访问，用类名或对象名都可以访问
    public static int getMax(int a,int b){
        return a > b ? a : b;
    }

    //实例方法:属于对象的，只能用对象触发访问
    public void study(){
        System.out.println(name + "在好好学习");
    }

    public static void main(String[] args) {
        //1.类名.静态成员方法
        System.out.println(Student.getMax(10,3));
        //同一个类中，访问静态方法，类名可以省略
        System.out.println(getMax(28,44));

        //2.对象.实例方法
        //study():    //报错了
        Student s = new Student();
        s.name = "狐羽落";
        s.study();

        //3.对象.静态方法（语法可行，但是不推荐）
        System.out.println(s.getMax(5,2));
    }
}
