package ejercicio1;

public class TestOverride {
	/*
	// el compilador detecta un error ya que no exite
	// metodo para sobreescribir
	@Override
	public String tostring() {
	return super.toString() + " Testeando: 'Override'";
	}
	*/
	
	/* 
	* La anotación @Override se utiliza, para forzar 
	* al compilador a comprobar en tiempo de compilación 
	* que estás sobrescribiendo correctamente un método, 
	* y de este modo evitar errores en tiempo de ejecución, 
	* los cuales serían mucho más difíciles de detectar.
	*/
	@Override
	public String toString() {
	return super.toString() + " Testeando: 'Override'";
	}
	
	/*
	public static void main(String[] args) {
		TestSobreescritura t = new TestSobreescritura();
		System.out.println(t);
	}
	*/
}
