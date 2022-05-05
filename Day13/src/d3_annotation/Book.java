package d3_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ Classname Book
 * @ Description TODO
 * @ Date 2022/5/4 20:52
 * @ Created by 落尘
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Book {
    String name();
    double price() default 100;
    String[] author();
}
