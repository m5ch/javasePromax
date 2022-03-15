package constant;

//目标：理解并使用常量

/**
 * 常量
 * 常量是使用了public static final修饰的成员变量，必须有初始化值，而且执行的过程中其值不能被改变。
 * 常量的作用和好处:可以用于做系统的配置信息，方便程序的维护，同时也能提高可读性。
 *
 * 常量的执行原理
 * 1.在编译阶段会进行“宏替换”，把使用常量的地方全部替换成真实的字面量。
 * 2.这样做的好处是让使用常量的程序的执行性能与直接使用字面量是一样的。
 */
public class Test1 {
    public static final String SCHOOL_NAME = "YPI";
    public static void main(String[] args) {
        System.out.println(SCHOOL_NAME);
        System.out.println(SCHOOL_NAME);
        System.out.println(SCHOOL_NAME);
    }
}
