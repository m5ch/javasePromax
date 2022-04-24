package task.bean;

/**
 * @ Classname User
 * @ Description TODO 用户类（客户和商家的父类）
 * @ Date 2022/4/22 20:23
 * @ Created by 落尘
 */
public class User {
    private String loginName;   //昵称
    private String userName;    //真名
    private String password;
    private char gender;
    private String phone;
    private double money;

    public User() {
    }

    public User(String loginName, String userName, String password, char gender, String phone, double money) {
        this.loginName = loginName;
        this.userName = userName;
        this.password = password;
        this.gender = gender;
        this.phone = phone;
        this.money = money;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
