package ejercicio3;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class CorredorCallable implements Callable<CorredorResultado> {
	
	private int km = 3;
	private Integer id;
	private Random random;
	
	public CorredorCallable(Integer id) {
		this.id= id;
		random = new Random();
	}

	 @Override
	 public CorredorResultado call() throws Exception {
	        int total=0;
		 	for(int i = 0; i < km; i++) {
	        	System.out.println(this.id + " recorrio " + i+ " km.");
	        	if(random.nextBoolean() & i != km-1) {
	        		//System.out.println("Corredorx " +this);
	        		return new CorredorResultado(this.id, i);
	        	}
	        	total ++;
	        	try {
					TimeUnit.MILLISECONDS.sleep(500);
					
				} catch (InterruptedException e) {
					
				}
	        }
		 	System.out.println("Corredorx "+ this.id +" llego!");
	        return new CorredorResultado(this.id, total);
	    }
	
	@Override
	public String toString() {
		return this.id + " en Tread: "+Thread.currentThread().getName();
	}
}
