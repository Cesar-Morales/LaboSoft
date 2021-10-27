package ejercicio1B;

abstract class InstrumentoDeViento implements InstrumentoMusical {

	@Override
	public void hacerSonar() {
		System.out.println("Sonar Vientos");

	}

	@Override
	public String queEs() {
		return "Instrumento De Viento";
	}

	@Override
	public void afinar() {
		System.out.println();

	}

}
