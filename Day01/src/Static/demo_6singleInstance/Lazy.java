package Static.demo_6singleInstance;

//懒汉单例
public class Lazy {
    //1.私有化构造器
    private Lazy(){

    }
    //2.定义一个静态的成员变量负责存储一个对象
    //只加载一次，只有一份
    public static Lazy instance;

    //3.提供一个方法，对外返回单例对象
    public static Lazy getInstance(){
        if (instance == null)
            instance = new Lazy();
        return  instance;
    }

}
