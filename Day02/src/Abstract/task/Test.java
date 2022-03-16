package Abstract.task;

//目标：理解模板方法模式的思想和使用\

/**
 * 1. 提高了代码的复用性
 * 2. 模板方法已经定义了通用结构,模板方法不能确定的部分定义成抽
 * 象方法，交给子类实现，因此，使用者只需要关心自己需要实现的功
 * 能即可。
 */
public class Test {
    public static void main(String[] args) {
        StudentChild s1 = new StudentChild();
        s1.write();
        System.out.println("============");
        StudentMiddle s2 = new StudentMiddle();
        s2.write();
    }
}
