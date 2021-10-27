package ejercicio3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class testRunnable {
	public static void main(String[] args) {
		
		// SIN EJECUTOR
		//Thread t = new Thread(new RunnableClase());
		//t.start();
		
		// CON EJECUTOR
		// Executor e = unEjecutor;
		// e.execute(new RunnableClase())
		
		//un ejecutor puede tener:
		//	un solo thread
		//	muchos threads
		//	threads bajo demanda
		ExecutorService exec = Executors.newFixedThreadPool(5);
		exec.execute(new Corredor("1"));
		exec.execute(new Corredor("2"));
		exec.execute(new Corredor("3"));
		exec.execute(new Corredor("4"));
		exec.execute(new Corredor("5"));
	}
	
}
