package lesson19.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//описание
//@Target() указывает за сфере ответветсвенности аннотации
// METHOD
//CONSTRUCTOR
//FIELD etc
//@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)   // во время выполнения
public @interface PermisionRequired {
    User.Permission value();  // can return String, primitives, enums, annotation
}
