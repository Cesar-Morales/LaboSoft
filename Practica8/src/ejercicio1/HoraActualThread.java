package ejercicio1;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class HoraActualThread extends Thread{

	private int contador = 3;
	
	@Override
	public String toString() {
		return getName() + ".";
	}
	
	@Override
	public void run() {
		for(int i = 0; i < contador; i++) {
			System.err.println(this);
			Calendar cal = Calendar.getInstance();
			Date fecha = cal.getTime();
			DateFormat fechaFormateada = DateFormat.getTimeInstance();
			System.out.println(fechaFormateada.format(fecha));
		try {
			TimeUnit.MILLISECONDS.sleep(1000);
		} catch(Exception e){}
	}
		
	}
}
