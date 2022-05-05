package d4_proxy.demo02;

/**
 * @ Classname User
 * @ Description TODO
 * @ Date 2022/5/5 15:40
 * @ Created by 落尘
 */
public class User implements UserService{
    private String name;
    private String password;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String login(String name, String password) {
        String rs = "错误~~";
        try {
            if ("admin".equals(name) && "123456".equals(password)){
                rs = "正确~~";
            }
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public void deleteUser() {
        try {
            System.out.println("正在删除用户~~");
            Thread.sleep(5000);
            System.out.println("删除成功~~");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String selectUser() {
        String rs = "张三";
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "选择了" + rs;
    }
}
