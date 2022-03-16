package Interface.demo3;

public class FootballMan implements People{
    String name;

    public FootballMan() {
    }

    public FootballMan(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void law() {
        System.out.println(name+"要守法");
    }

    @Override
    public void eat() {
        System.out.println(name + "要吃饭");
    }

    @Override
    public void sleep() {
        System.out.println(name+"要睡觉");
    }

    @Override
    public void run() {
        System.out.println(name + "要跑步");
    }

    @Override
    public void competition() {
        System.out.println(name+"要比赛");
    }
}
