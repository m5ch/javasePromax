package d3_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ Classname Mytest
 * @ Description TODO
 * @ Date 2022/5/4 19:38
 * @ Created by 落尘
 */
@Target({ElementType.METHOD,ElementType.FIELD})   //元注解
@Retention(RetentionPolicy.RUNTIME) //一直活着，在运行阶段，注解也不会消失
public @interface Mytest {

}
