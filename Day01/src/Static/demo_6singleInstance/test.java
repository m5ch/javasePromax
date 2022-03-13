package Static.demo_6singleInstance;

public class test {
    public static void main(String[] args) {

        Single s1 = Single.instance;
        Single s2 = Single.instance;
        System.out.println(s1 == s2);
    }
}
