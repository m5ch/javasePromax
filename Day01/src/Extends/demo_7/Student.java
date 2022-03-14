package Extends.demo_7;

public class Student {
    private String name;
    private String school;

    public Student() {

    }

    //如果学生不填写学校，则默认为黑马

    public Student(String name){
        this(name,"黑马程序员");
    }

    public Student(String name, String school) {
        this.name = name;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
