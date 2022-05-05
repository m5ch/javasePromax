package d4_proxy.demo02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ Classname UserAgentProxy
 * @ Description TODO
 * @ Date 2022/5/5 16:06
 * @ Created by 落尘
 */
public class UserAgentProxy {

    public static UserService getProxy(User user){
        return (UserService) Proxy.newProxyInstance(user.getClass().getClassLoader(),
                user.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        long start = System.currentTimeMillis();
                        //触发方法执行
                        Object rs =  method.invoke(user, args);

                        long end = System.currentTimeMillis();
                        System.out.println(method.getName() + "耗时:" + (end - start) / 1000.0);
                        return rs;
                    }
                });
    }
}
