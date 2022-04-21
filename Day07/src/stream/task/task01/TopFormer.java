package stream.task.task01;

/**
 * @ Classname TopFormer
 * @ Description TODO
 * @ Date 2022/4/21 19:30
 * @ Created by 落尘
 */
public class TopFormer {
    private String name;
    private int salary;

    public TopFormer() {
    }

    public TopFormer(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "TopFormer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
