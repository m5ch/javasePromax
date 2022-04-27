package serializable;

import java.io.Serializable;

/**
 * @ Classname Student
 * @ Description TODO 对象要序列化，必须实现Serializable序列化接口
 * @ Date 2022/4/26 21:03
 * @ Created by 落尘
 */
public class Student implements Serializable {
    private String name;
    //transient 修饰的成员变量不再参与序列化
    private transient int age;
    private char gender;

    public Student() {
    }

    public Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
