package Static.demo_4util;


import java.util.Random;

//工具类
public class utils {
    /**
     * 由于工具里面都是静态方法，直接用类名即可访问，
     * 因此，工具类无需创建对象，建议将工具类的构造器进行私有。
     */
    private utils(){

    }

    /*
        静态方法
     */
    public static String creatCode(int n) {
        //开发一个验证码
        String pass = "";
        Random r = new Random();
        String all = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
            for (int i = 0; i < n; i++) {
            int a =  r.nextInt(all.length());
            pass += all.charAt(a);
        }
//            System.out.println(pass);
        return pass;
    }
}
