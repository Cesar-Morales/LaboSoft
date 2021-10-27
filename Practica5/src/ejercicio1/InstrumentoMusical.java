package ejercicio1;

public interface InstrumentoMusical {

	void hacerSonar();
	String queEs();
	default void afinar() {
		System.out.println("Guitarra afinada!");
	};
	void hacerSonar(Notas n, int duracion);
	void afinar(FrecuenciasDeLA f);
}
