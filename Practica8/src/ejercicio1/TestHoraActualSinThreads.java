package ejercicio1;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TestHoraActualSinThreads{
	
	private static int contador = 10;
	public static void main(String[] args) {
		for(int i = 0; i < contador; i++) {
			Calendar cal = Calendar.getInstance();
			Date fecha = cal.getTime();
			//System.out.println(fecha);
			DateFormat fechaFormateada = DateFormat.getTimeInstance();
			System.out.println(fechaFormateada.format(fecha));
			try {
				TimeUnit.MILLISECONDS.sleep(1000);
			} catch(Exception e){}
		}
		System.out.println("Termino Secuencial");
	}
}