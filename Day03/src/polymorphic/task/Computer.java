package polymorphic.task;

public class Computer {
    private String name;

    public Computer() {
    }

    public Computer(String name) {
        this.name = name;
    }

    /*
        提供安装USB设备的入口
     */
    public void install(USB usb){
        if (usb instanceof Keyboard){
            Keyboard k = (Keyboard)usb;
            k.connect();
            k.run();
            k.unconnected();
        }
        else if (usb instanceof Mouse m){
            m.connect();
            m.run();
            m.unconnected();
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
