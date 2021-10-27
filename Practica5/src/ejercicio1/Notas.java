package ejercicio1;
//C D E F G A B

public enum Notas {
	
	DO("C"),
	RE("D"),
	MI("E"),
	FA("F"),
	SOL("G"),
	LA("A"),
	SI("B");

	private String cifrado;
	
	Notas(String string) {
		this.cifrado = string;
	}
	
	public String cifrado() { return cifrado; }
	
	@Override
	public String toString() {
		return cifrado;
	}
	
}
