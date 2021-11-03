package ejercicio3;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(TYPE)
public @interface Servidor {
	String direccion() default "127.0.0.1";
	String puerto() default "8080";
	String archivo() default "archivo.txt";
	
	
}
