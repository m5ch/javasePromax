package stream.task.task01;

/**
 * @ Classname Department
 * @ Description TODO
 * @ Date 2022/4/21 19:00
 * @ Created by 落尘
 */
public class Department {
    private String name;
    private char gender;
    private int salary;
    private int bonus;
    private int punish;

    public Department() {
    }

    public Department(String name, char gender, int salary, int bonus, int punish) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.bonus = bonus;
        this.punish = punish;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getPunish() {
        return punish;
    }

    public void setPunish(int punish) {
        this.punish = punish;
    }
}
