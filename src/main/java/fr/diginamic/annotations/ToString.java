package fr.diginamic.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Objects;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ToString {
    boolean uppercase() default false;
    String separator() default "";
}


