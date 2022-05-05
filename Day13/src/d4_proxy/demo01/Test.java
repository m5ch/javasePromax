package d4_proxy.demo01;

/**
 * @ Classname Test
 * @ Description TODO 学习开发出一个动态代理对象，理解动态代理的流程
 * @ Date 2022/5/5 13:52
 * @ Created by 落尘
 */
public class Test {
    public static void main(String[] args) {
        //1.创建一个对象，对象的类必须实现接口
        Star s = new Star("杨超越",18);
        //2.为Star对象生成一个代理对象
        Skill sk = StarAgentProxy.getProxy(s);
        sk.dance();
        sk.sing();


    }
}
