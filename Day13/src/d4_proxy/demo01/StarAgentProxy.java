package d4_proxy.demo01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ Classname StarAgentProxy
 * @ Description TODO
 * @ Date 2022/5/5 14:12
 * @ Created by 落尘
 */
public class StarAgentProxy {
    /*
        设计一个方法，返回代理对象
     */

    public static Skill getProxy(Star s){
        //生成代理对象
        return (Skill)Proxy.newProxyInstance(s.getClass().getClassLoader(),
                s.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("收首付款");
                        method.invoke(s);
                        System.out.println("收尾款");
                        return null;
                    }
                });
    }
}
