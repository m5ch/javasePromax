package d1_JUnit;

/**
 * @ Classname demo01
 * @ Description TODO 业务方法
 * @ Date 2022/5/3 15:22
 * @ Created by 落尘
 */
public class demo01 {
    public String loginName(String name,String password){
        if (name.equals("admin") && password.equals("123456")){
            return "登录成功~";
        }
        else{
            return "有问题~";
        }
    }

    public void selectServer(String name, String password){
        System.out.println(10 / 2);
        System.out.println("啦啦啦~~~");
    }
}
