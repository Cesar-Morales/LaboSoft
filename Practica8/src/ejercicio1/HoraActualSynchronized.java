package ejercicio1;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class HoraActualSynchronized extends Thread{

	@Override
	public String toString() {
		return getName() + ".";
	}
	
	@Override
	public void run() {
		synchronized(System.out) {
			System.err.println(this);
			Calendar cal = Calendar.getInstance();
			Date fecha = cal.getTime();
			DateFormat fechaFormateada = DateFormat.getTimeInstance();
			System.out.println(fechaFormateada.format(fecha));
			try {
				TimeUnit.MILLISECONDS.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}

