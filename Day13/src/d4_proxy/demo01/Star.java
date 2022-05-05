package d4_proxy.demo01;

/**
 * @ Classname student
 * @ Description TODO
 * @ Date 2022/5/5 13:51
 * @ Created by 落尘
 */
public class Star implements Skill{
    private String name;
    private int age;

    public Star() {
    }

    public Star(String name, int age) {
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
    public void dance() {
        System.out.println(name + "跳了支舞");
    }

    @Override
    public void sing() {
        System.out.println(name + "唱了首歌");
    }
}
