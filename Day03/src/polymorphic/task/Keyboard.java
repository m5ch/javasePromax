package polymorphic.task;

public class Keyboard implements USB{
    private String name;

    public void run(){
        System.out.println("打出了：爱你，么么哒~~");
    }

    public Keyboard() {
    }

    public Keyboard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name + "键盘成功接入");
    }

    @Override
    public void unconnected() {
        System.out.println(name + "键盘成功移除");
    }
}
