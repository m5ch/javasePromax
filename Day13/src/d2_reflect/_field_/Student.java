package d2_reflect._field_;

/**
 * @ Classname Student
 * @ Description TODO
 * @ Date 2022/5/4 15:18
 * @ Created by 落尘
 */
public class Student {
    private static final String COUNTRY = "中国";
    private static String schoolName;
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
