package d4_proxy.demo02;

/**
 * @ Classname UserService
 * @ Description TODO
 * @ Date 2022/5/5 15:03
 * @ Created by 落尘
 */
public interface UserService {
    String login(String name, String password);
    void deleteUser();
    String  selectUser();
}
