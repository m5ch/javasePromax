package innerclass.demo1;

public class Test {
    public static void main(String[] args) {
        Outer.Inner a = new Outer.Inner("内部类");
        System.out.println(a.getName());
    }
}
