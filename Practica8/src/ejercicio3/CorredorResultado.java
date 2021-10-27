package ejercicio3;

public class CorredorResultado {
	private Integer corredor;
	private Integer kilometro;
	
	
	public CorredorResultado(Integer id, Integer kilometro) {
		this.corredor= id;
		this.kilometro = kilometro;
	}

	
	public Integer getId() {
		return corredor;
	}
	public void setId(Integer corredor) {
		this.corredor = corredor;
	}
	public Integer getKilometro() {
		return kilometro;
	}
	public void setKilometro(Integer kilometro) {
		this.kilometro = kilometro;
	}
	
	
	
}
