package ejercicio3;

import java.util.concurrent.TimeUnit;

public class Corredor implements Runnable{
	
	private int km = 5;
	private String name;
	
	public Corredor(String string) {
		name = string;
	}

	@Override
	public void run() {
		for (int i = 1; i < km; i++) {
			System.out.println(this.name + " recorrio " + i+ " km.");
			try {
				TimeUnit.MILLISECONDS.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
		System.out.println("Corredorx "+ this +" llego!");
	}
	


	@Override
	public String toString() {
		return this.name + " en Tread: "+Thread.currentThread().getName();
	}
}
