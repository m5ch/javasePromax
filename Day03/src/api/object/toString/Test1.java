package api.object.toString;

/*
    目标：掌握Object类中 toString 方法的使用
 */
public class Test1 {
    public static void main(String[] args) {
        Student s = new Student("jack",20,'男');
        System.out.println(s.toString());
        System.out.println(s);
    }
}
