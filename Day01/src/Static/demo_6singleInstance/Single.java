package Static.demo_6singleInstance;


//使用饿汉单例实现单例类
public class Single {
    //1.构造器私有化
    private Single(){

    }

    /*2.
        饿汉单例是在获取对象前，对象已经提前准备好了一个
        这个对象只能是一个，所以定义静态成员方法记住
     */

    public static Single instance = new Single();
}
