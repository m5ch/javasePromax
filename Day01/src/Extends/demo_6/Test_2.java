package Extends.demo_6;

//目标：学习子类构造器如何去访问父类的有参数构造器，清楚其作用
public class Test_2 {
    public static void main(String[] args) {
        Student s1 = new Student("小黑",21);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}
