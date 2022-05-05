package d2_reflect._framework_;

/**
 * @ Classname Teacher
 * @ Description TODO
 * @ Date 2022/5/4 17:16
 * @ Created by 落尘
 */
public class Teacher {
    private String name;
    private char gender;
    private double salary;

    public Teacher() {
    }

    public Teacher(String name, char gender, double salary) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
