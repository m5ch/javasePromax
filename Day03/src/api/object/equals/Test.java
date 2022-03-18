package api.object.equals;

/*
    目标：掌握Object类中 equals 方法的使用
 */
public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("jack",30);
        Teacher t2 = new Teacher("jack",30);
        System.out.println(t1.equals(t2));
    }

}
