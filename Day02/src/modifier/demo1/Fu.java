package modifier.demo1;

public class Fu {
    // 1.private只能本类中访问
    private void show1() {
        System.out.println( "private");
    }
    //2.缺省:本类，同一个包下的类中。
    void show2() {
        System.out.println("缺省");
    }
    // 3.protected:本类，同一个包下的类中，其他包下的子类
    protected void show3() {
        System.out.println( "protected");
    }
    //4.ppublic:任何地方都可以
    public void show4() {
        System.out.println( "public");
    }
    public static void main(String[ ] args) {
        //创建Fu的对象，测试看有哪些方法可以使用
        Fu f = new Fu();
        f.show1();
        f.show2();
        f.show3();
        f.show4();
    }

}

