package ejercicio1parte2;

public class TestAnotaciones{
	
	public static void main(String arg[]) throws Exception {
				new TestAnotaciones().testearYa();
	}
		
	/*
	 
	 * Esta notacion nos elimina cualquier 
	 * advertencia del compilador para que
	 * "no molesten".
	 
	 */
	@SuppressWarnings("deprecation")
	public void testearYa() {
		TestDeprecated t2 = new TestDeprecated();
		t2.hacer();
	}
	
	/*
	 
	 * NOTA
	 * Estas anotaciones son solo procesadas por
	 * el compilador. Ahi son procesadas y luego
	 * se descartan. No aparecen en el .class
	 
	 */

}
