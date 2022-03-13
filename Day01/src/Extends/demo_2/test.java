package Extends.demo_2;

//理解继承的设计思想
public class test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("狐羽落");      //父类的
        s1.setAge(22);           //父类的
        s1.act();                //父类的
        s1.act2();               //自己的
        Teacher t1 = new Teacher();
        t1.setName("leo");      //父类的
        t1.setAge(30);          //父类的
        t1.act1();              //自己的
    }
}
