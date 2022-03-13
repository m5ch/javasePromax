package Static.demo_6singleInstance;

public class test2 {
    public static void main(String[] args) {
        Lazy s1 = Lazy.getInstance();
        Lazy s2 = Lazy.getInstance();
        System.out.println(s1);
        System.out.println(s2);
    }
}
