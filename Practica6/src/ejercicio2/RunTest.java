package ejercicio2;
import java.io.FileWriter;
import java.lang.reflect.*;

public class RunTest {
	
	public static void main(String[] args){
		Mapeado m = new Mapeado();
		crearArchivo(m);
	}
	
	public static void crearArchivo(Object o) {
		/*Lo mismo que la linea siguiente. COn la diferencia que uso try/catch
		 * porque puede no existir el nombre de la clase
		Class<?> testClass;
		try {
			testClass = Class.forName("Mapeado");
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		}
		// esto tambien es lo mismo pero habria que hacer un throws exception para que lo manejen las clases que "me llamen"
		Class<?> testClass = Class.forName("Mapeado");
		*/
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
