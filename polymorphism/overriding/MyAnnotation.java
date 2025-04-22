package polymorphism.overriding;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// User defined annotation

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface MyAnnotation {
    String value();
    int number() default 11;

   // int show();

   // int a =1;
}
