package ejercicio1parte2;

public class TestDeprecated {
	
	/*
	 
	 * Esta anotacion nos sirve para indicar
	 * que el elemento va a ser reemplazado 
	 * en futuras versiones.
	 * Va a dejar compilarlo pero va a tirar warnings
	 
	 */
	@Deprecated
	public void hacer() {
		System.out.println("Testeando: 'Deprecated'");
	}
	
}
