package ejercicio1;

public class Test1 {
	
	public static void main(String[] args) {
		try {
			
			/* PRIMER ERROR. MAL ESCRITA LA CLASE
			 * 
			 * throw new Exception2();
			 * 
			 */
			
			System.out.println(1/0);
			throw new Excepcion2();
			//throw new Excepcion1(); para llegar a la segunda excepcion (Excepcion1)
			
		} catch(ArithmeticException ae) {
			System.out.println("Dividiste por cero wachin");
			ae.printStackTrace();
		}catch(Excepcion2 e2) {
			System.out.println("Se capturó la Excepción2");
		} catch(Excepcion1 e1) {
			System.out.println("Se capturó la Excepción1");
		} 
		
			/*	SEGUNDO ERROR. No se llega a producir nunca, es unreachable.
			 * 
			 * catch( Excepcion2 e2) { 
			 * System.out.println("Se capturó la Excepción2");
			 * }
			 * 
			 */
	
	}
	
}
