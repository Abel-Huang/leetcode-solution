package cn.abelib.util.annotation;

import cn.abelib.util.enums.StatusEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: abel.huang
 * @Date: 2019-04-30 02:37
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Status {
    StatusEnum value() default StatusEnum.DOING_NOW;
}
