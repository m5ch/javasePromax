package Extends.demo_7;


import Extends.demo_7.Student;

//目标：理解this()的作用：本类构造器中访问本类兄弟构造器
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("小黑","白马程序员");
        System.out.println(s1.getName());
        System.out.println(s1.getSchool());
        System.out.println("++++++++++++++++");
        Student s2 = new Student("小白");
        System.out.println(s2.getName());
        System.out.println(s2.getSchool());
    }
}
