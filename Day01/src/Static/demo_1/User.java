package Static.demo_1;

public class User {

    /*
        在线人数
        注意：static修饰的成员变量：静态成员变量，只在内存中有一份
     */
    public static int onlineNumber = 122;


    /*
        实例成员变量：无static修饰，属于每个对象的，必须用对象名访问
     */
    private String name;
    private int age;
    private String gender;
    public static void main(String[] args) {
        //1.类名.静态成员变量
        System.out.println(User.onlineNumber);

        //2.对象名.实例成员变量
//        System.out.println(User.name);    //报错
        User u = new User();
        u.name = "张三";
        u.age = 22;
        System.out.println(u.name);
        System.out.println(u.age);

        System.out.println(u.onlineNumber);
        System.out.println(User.onlineNumber);  //推荐
        //注意：同一个类中静态成员变量的访问可以省略类名
        System.out.println(onlineNumber);

    }
}
