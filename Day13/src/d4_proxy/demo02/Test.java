package d4_proxy.demo02;

/**
 * @ Classname Test
 * @ Description TODO
 * @ Date 2022/5/5 16:08
 * @ Created by 落尘
 */
public class Test {
    public static void main(String[] args) {
        UserService user = UserAgentProxy.getProxy(new User());

        System.out.println(user.login("admin", "123456"));
        user.deleteUser();
        System.out.println(user.selectUser());


    }
}
