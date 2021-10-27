package ejercicio1;

public class Guitarra implements InstrumentoMusical{

	@Override
	public void hacerSonar() {
		System.out.println("Tocando Guitarra!");
	}

	@Override
	public String queEs() {
		return this.getClass().toString();
	}

	@Override
	public void hacerSonar(Notas n, int duracion) {
		System.out.println("Tocando nota "+ n + " con una duracion de "+ duracion +".");
	}

	@Override
	public void afinar(FrecuenciasDeLA f) {
		System.out.println("Afinado en "+ f);
	}
	
}
