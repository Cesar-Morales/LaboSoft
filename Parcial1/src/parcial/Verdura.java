package parcial;

public class Verdura {
	private String nombre;
	private Integer cantidad;
	private boolean cosechada;
	private Integer mes;
	private int anio;
	
	public Verdura(String nombre, Integer cantidad, boolean cosechada, Integer mes, Integer anio) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.cosechada = cosechada;
		this.mes = mes;
		this.anio = anio;
	}
	
	public Integer getCantidad() {
		return this.cantidad;
	}
	
	public boolean getCosechada() {
		return this.cosechada;
	}

	public String getNombre() {
		return nombre;
	}
	
	public Integer getMes() {
		return mes;
	}
	
	public Integer getAnio() {
		return anio;
	}

	@Override
	public String toString() {
		return "\n\t\t\t" + nombre + " { cantidad:" + cantidad + ", cosechada:" + cosechada + ", mes:"
				+ mes + ", anio:"+ anio+ " }";
	}
	
	
	
	
}
