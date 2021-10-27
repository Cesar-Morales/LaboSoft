package ejercicio2;
import java.io.FileWriter;
import java.lang.reflect.*;

public class RunTest {
	
	public static void main(String[] args) throws Exception{
		Mapeado m = new Mapeado();
		crearArchivo(m);
	}
	
	public static void crearArchivo(Object o) {
		Class<?> testClass = o.getClass();
		Field[] variables = testClass.getDeclaredFields();
		String nombreDelArchivo = testClass.getAnnotation(Archivo.class).nombre();
		if ( nombreDelArchivo.equals("")) {
			nombreDelArchivo = testClass.getSimpleName()+".txt";
		}
		try {
			FileWriter fichero = new FileWriter(nombreDelArchivo);
		    fichero.write("<nombreClase>"+ testClass.getSimpleName() +"</nombreClase>\n");
			for (Field variable : variables) {
					variable.setAccessible(true);
					if (variable.isAnnotationPresent(AlmacenarAtributo.class)) {
						fichero.write("<nombreAtributo>"+ variable.getName() +"</nombreAtributo>\n");
						fichero.write("<nombreValor>"+ variable.get(o) +"</nombreValor>\n");
					}
			}
			fichero.close();
		} catch (Exception e) {
			System.err.println("Fallo");
		}
	}
}
