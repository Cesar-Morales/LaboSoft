package ejercicio1;

public enum Artista {
	
	LUISALBERTOSINETTA(new Guitarra());
	
	private InstrumentoMusical instrumento;
	
	Artista(InstrumentoMusical instrumento) {
		this.instrumento= instrumento;
	}

	public void tocarCancion(Melodia melodias[]) {
		
		for(int i=0; i < melodias.length; i++) {
			instrumento.hacerSonar(melodias[i].getNota(), melodias[i].getTiempo());
		}
		
	}

	
}
