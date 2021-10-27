package ejercicio1;

public class Melodia {
	
	private Notas nota;
	private Integer tiempo;
	
	public Melodia(Notas n, Integer t) {
		
		this.nota = n;
		this.tiempo = t;
		
	}

	public Notas getNota() {
		return nota;
	}

	public Integer getTiempo() {
		return tiempo;
	}
	
	
}
