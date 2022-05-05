package d3_annotation;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @ Classname demo03
 * @ Description TODO
 * @ Date 2022/5/4 20:51
 * @ Created by 落尘
 */
public class demo03 {
    /*
        需求:注解解析的案例分析
        定义注解Book，要求如下:
        -包含属性:String value()书名
        -包含属性:double price(）价格，默认值为100-包含属性: string[] authors()多位作者
        -限制注解使用的位置:类和成员方法上-指定注解的有效范围:RUNTIME
        定义BookStore类，在类和成员方法上使用Book注解定义AnnotationDemo01测试类获取Book注解上的数据
     */

    @Test
    public void fun1(){
        //先得到类对象
        Class c = bookstore.class;

        //判断是否存在该注解
        if (c.isAnnotationPresent(Book.class)){
            //直接获取该注解对象
            Book book = (Book) c.getDeclaredAnnotation(Book.class);
            System.out.println(book.name());
            System.out.println(book.price());
            System.out.println(Arrays.toString(book.author()));
        }
    }

    @Test
    public void fun2() throws Exception {
        Class c = bookstore.class;

        Method method = c.getDeclaredMethod("fun");

        if (method.isAnnotationPresent(Book.class)){
            //直接获取该注解对象
            Book book = (Book) method.getDeclaredAnnotation(Book.class);
            System.out.println(book.name());
            System.out.println(book.price());
            System.out.println(Arrays.toString(book.author()));
        }
    }


}

@Book(name = "《西游记》",price = 50,author = {"吴承恩"})
class bookstore{

    @Book(name = "《水浒传》",price = 50,author = {"施耐庵"})
    public void fun(){

    }

}