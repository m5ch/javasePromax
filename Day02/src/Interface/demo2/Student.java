package Interface.demo2;

public class Student implements People{
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "要跑步");
    }

    @Override
    public void competition() {
        System.out.println(name +"要比赛");
    }
}
