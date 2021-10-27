package ejercicio2;

public class TestSynchronized extends Thread{

	String[] frase = {"España","en","los","diarios","de","mi","vejez"};

	public TestSynchronized(String id) {
		super(id);
	}
	
	public void run ( ) {
		//exclusion mutua
		synchronized(System.out) {
			for (int i = 0; i < frase.length; i++) {
				System.out.println(this.getName() + ": " + frase[i] + "\n");
			}
		}
	}
	
	public static void main(String[] args) {
		TestSynchronized t1 = new TestSynchronized("Thread 1");
		TestSynchronized t2 = new TestSynchronized("Thread 2");
		TestSynchronized t3 = new TestSynchronized("Thread 3");
		t1.start();
		t2.start();
		t3.start();
	}
}


// El metodo synchronized lleva entre parentesis la referencia a un objeto
// Cada vez que un thread intenta acceder a un bloque sincronizado le pregunta a 
// ese objeto si no hay algún otro thread que ya tenga el lock para ese objecto.
// Si el lock está tomado por otro thread, entonces el thread actual es suspendido 
// y puesto en espera hasta que el lock se libere. Si el lock está libre, entonces
// el thread actual toma el lock del objeto y entra a ejecutar el bloque. Al tomar el lock,
// cuando venga el proximo thread a intentar ejecutar un bloque sincronizado con ese objeto, será puesto en espera.



