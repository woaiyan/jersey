package rest;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.METHOD})
public @interface tests {}


/* Location:           E:\WEB-INF\classes\
 * Qualified Name:     rest.tests
 * JD-Core Version:    0.7.0.1
 */