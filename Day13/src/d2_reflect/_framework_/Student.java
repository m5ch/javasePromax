package d2_reflect._framework_;

/**
 * @ Classname Student
 * @ Description TODO
 * @ Date 2022/5/4 17:16
 * @ Created by 落尘
 */
public class Student {
    private String name;
    private int age;
    private char gender;
    private String className;
    private String hobby;

    public Student() {
    }

    public Student(String name, int age, char gender, String className, String hobby) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.className = className;
        this.hobby = hobby;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
