package ejercicio3;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class testCallable {
	public static void main(String[] args) {
		ExecutorService exec= Executors.newFixedThreadPool(5);
        ArrayList<Future<CorredorResultado>> resultado = new ArrayList<>(5);
        for (int i = 0; i<5;i++){
        	resultado.add(exec.submit(new CorredorCallable(i)));
        }
        exec.shutdown();
        int i = 0;
        while (i < 5) {            	
        	if(resultado.get(i).isDone()) {
        		try {
        			CorredorResultado corredor = resultado.get(i).get();
	            	if (corredor.getKilometro() != 3) {
	            		System.out.println("Corredorx "+ corredor.getId() +" no llego! Se quedo en el kilometro: "+ corredor.getKilometro());
	            	}
        		}catch (NoSuchElementException e) {
        			System.out.println(e);
	            } catch (Exception e) {
	            	System.out.println(e.getMessage());
	            }
            	i++;
            }
        }
	}
}
