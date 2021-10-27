package ejercicio1;

import java.util.concurrent.TimeUnit;

public class TestHoraActualConThreads {
	
	public static void main(String[] args) {
		int contador = 3;
		
		
		///MUCHOS THREADS PERO EN PARALELO
		System.out.println(contador+" thread imprimen de a uno la hora actual");
		for(int i = 0; i < contador; i++) {
				new HoraActualThreads().start();
			try {
				TimeUnit.MILLISECONDS.sleep(1000);
			} catch(Exception e){}
		}
		System.out.println("Fin del los "+contador+" threads");
		
		System.out.println();
		
		
		
		
		
		///UN SOLO THREADS 
		System.out.println("Un solo thread imprime la hora actual");
		HoraActualThread threadHora = new HoraActualThread();
		threadHora.start();
		//espero a que termine el threadHora
		try {
			threadHora.join();
		} catch (InterruptedException e) {}
		
		// ahora si imprimo la linea final
		System.out.println("Fin del los thread");
		
		System.out.println();
		
		
		
		
		
		System.out.println(contador+" thread imprimen de a uno la hora actual");
		HoraActualSynchronized[] threads = new HoraActualSynchronized[3];
		///MUCHOS THREADS CONCURRENCIA
		threads[0] = new HoraActualSynchronized();
		threads[1] = new HoraActualSynchronized();
		threads[2] = new HoraActualSynchronized();
		threads[0].start();
		threads[1].start();
		threads[2].start();
		
		try {
			TimeUnit.MILLISECONDS.sleep(1000*contador);
		} catch(Exception e){}
		System.out.println("Fin del los "+contador+" threads");
	}
}
