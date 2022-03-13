package Extends.demo_2;

/*
    父类
 */
public class People {
    private String name;
    private int age;
    public void act(){
        System.out.println(name + "查询了课表");
    }

    public People() {
    }

    public People(String name, int age) {
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
}
