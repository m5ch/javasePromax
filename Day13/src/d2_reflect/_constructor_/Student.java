package d2_reflect._constructor_;

/**
 * @ Classname Student
 * @ Description TODO
 * @ Date 2022/5/4 14:19
 * @ Created by 落尘
 */
public class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("无参构造器执行~~");
    }

    public Student(String name, int age) {
        System.out.println("有参构造器执行~~");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
