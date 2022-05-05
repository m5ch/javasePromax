package d2_reflect._framework_;

/**
 * @ Classname demo01
 * @ Description TODO 提供一个通用框架，支持保存所有对象的具体信息
 * @ Date 2022/5/4 17:15
 * @ Created by 落尘
 */
public class demo01 {
    public static void main(String[] args) throws Exception{
        Student s1 = new Student();
        s1.setName("尤勇");
        s1.setAge(22);
        s1.setGender('男');
        s1.setClassName("1班");
        s1.setHobby("下棋");
        MybatisUtil.save(s1);

        Student s2 = new Student();
        s2.setName("夏琪");
        s2.setAge(20);
        s2.setGender('女');
        s2.setClassName("2班");
        s2.setHobby("游泳");
        MybatisUtil.save(s2);

        Teacher t = new Teacher();
        t.setName("张三");
        t.setGender('男');
        t.setSalary(8888.88);
        MybatisUtil.save(t);

    }
}
