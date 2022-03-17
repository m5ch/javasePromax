package polymorphic.task;

/**
 * 需求:
 * 使用面向对象编程模拟:设计一个电脑对象，可以安装2个USB设备
 * 鼠标:被安装时可以完成接入、调用点击功能、拔出功能。
 * 键盘:被安装时可以完成接入、调用打字功能、拔出功能。
 */
public class Test {
    public static void main(String[] args) {
        Computer c = new Computer("lenovo");
        System.out.println(c.getName() + "启动了");
        System.out.println("===========");
        USB k = new Keyboard("双飞燕");
        USB m = new Mouse("logi");
        c.install(k);
        System.out.println("===========");
        c.install(m);
    }
}
