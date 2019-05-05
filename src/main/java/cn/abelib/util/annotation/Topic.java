package cn.abelib.util.annotation;

import cn.abelib.util.enums.TopicEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: abel.huang
 * @Date: 2019-04-30 02:35
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Topic {
    TopicEnum[] value();
}
