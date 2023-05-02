package me.whiteship.chapter05.item27.annotation;

import java.lang.annotation.*;

//@Documented
//@Retention(RetentionPolicy.RUNTIME)
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.TYPE})
public @interface MyAnnotation {
}
