package d1_JUnit;

import org.junit.*;

/**
 * @ Classname Tests_demo01
 * @ Description TODO 测试类
 * @ Date 2022/5/3 15:42
 * @ Created by 落尘
 */
public class Tests_demo01 {
    /*
        修饰静态方法（JUnit 4）
     */
    @BeforeClass
    public static void beforeClass(){
        System.out.println("======beforeClass执行=======");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("======afterClass执行=======");
    }

    /*
        修饰实例方法(JUnit 4)
     */
    @Before
    public void before(){
        System.out.println("======before执行=======");
    }

    @After
    public void after(){
        System.out.println("======after执行=======");
    }

    /*
        注意点：
        1.必须是公开的，无参数，无返回值的方法
        2.Test放噶必须使用 @Test 注解标记
     */

    @Test
    public void testLoginName(){
        demo01 s1 = new demo01();
        String rs = s1.loginName("admin","123456");

        //进行预期结果的正确性测试：断言。
        Assert.assertEquals("你的业务有问题！",
                "登录成功~", rs);

    }


    @Test
    public void testSelectServer(){
        demo01 s1 = new demo01();
        s1.selectServer("admin","123456");
    }
}
