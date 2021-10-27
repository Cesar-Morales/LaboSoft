package ejercicio1;

public enum FrecuenciasDeLA {
	
	F440Hz("Organización Internacional de Estandarización ISO 16."),
	F444Hz("Afinación de cámara."),
	F446Hz("Renacimiento."),
	F480Hz("Órganos alemanes que tocaba Bach.");

	private String description;
	
	FrecuenciasDeLA(String string) {
		this.description = string;
	}
	
	@Override
	public String toString() {
		return name() + " " + description;
	}
	
}
