package polymorphic.task;

public class Mouse implements USB{
    private String name;

    public void run(){
        System.out.println("双击了”一键三连！！“");
    }

    public Mouse() {
    }

    public Mouse(String name) {
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
        System.out.println(name + "鼠标成功接入");
    }

    @Override
    public void unconnected() {
        System.out.println(name + "鼠标成功移除");
    }
}
