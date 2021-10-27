package ejercicio1;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class HoraActualThreads extends Thread{

	@Override
	public String toString() {
		return getName() + ".";
	}
	
	@Override
	public void run() {
		System.err.println(this);
		Calendar cal = Calendar.getInstance();
		Date fecha = cal.getTime();
		DateFormat fechaFormateada = DateFormat.getTimeInstance();
		System.out.println(fechaFormateada.format(fecha));
	}
}
