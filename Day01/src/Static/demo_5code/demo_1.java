package Static.demo_5code;

//目标：理解代码块


public class demo_1 {
    /**
     * 静态代码块:
     * 格式:static{}
     * 特点:需要通过static关键字修饰，随着类的加载而加载，并且自动触发、只执行一次
     * 使用场景:在类加载的时候做一些静态数据初始化的操作，以便后续使用。
     */
    static{
        System.out.println("========静态代码块被执行了==========");
    }


    /**
     * 构造代码块（了解,见的少):
     * 格式:{}
     * 特点:每次创建对象，调用构造器执行时，都会执行该代码块中的代码，并且在构造器执行前执行
     * 使用场景:初始化实例资源。
     */
    {
        System.out.println("=====实例代码块被触发执行了======");
    }
    public static void main(String[] args) {
        demo_1 s = new demo_1();
    }

}
