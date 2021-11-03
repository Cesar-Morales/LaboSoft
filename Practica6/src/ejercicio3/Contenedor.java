package ejercicio3;

import java.io.FileWriter;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Contenedor {
	
	
	public static void main(String[] args) {
		ServidorHTTP server = new ServidorHTTP();
		testearAnotaciones(server);
	}
	
	private static void testearAnotaciones(Object obj) {
		Class<?> testClass = obj.getClass();
		String dire = testClass.getAnnotation(Servidor.class).direccion();
		String port = testClass.getAnnotation(Servidor.class).puerto();
		String fileName = testClass.getAnnotation(Servidor.class).archivo();
		try {
			FileWriter fichero = new FileWriter(fileName);
			DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
			String dateHs = date.format(LocalDateTime.now());
			//Sobreescribe el fichero
			fichero.write(dateHs+" --- "+dire+":"+port+"\n");
			System.out.println("Servidor atendiendo en "+dire+":"+port+"\n");
			for(Method metodo : obj.getClass().getMethods()){
                if(metodo.getAnnotation(Invocar.class) != null){
                    metodo.invoke(obj);
                }
            }
			fichero.close();
		} catch (Exception e) {
			System.err.println("Fallo");
		}
		//System.out.println(dire+":"+port);
	}
}

