package ejercicio1B;

public interface InstrumentoMusical {
	void hacerSonar();
	String queEs();
	default void afinar() {
		System.out.println("asdasd");
	};
}

