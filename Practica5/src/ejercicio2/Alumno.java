package ejercicio2;

public class Alumno {
	
	public Alumno(String nroLegajo, String nombre, String apellido, Integer edad,
			String materia, Integer nota) {
		super();
		this.nroLegajo = nroLegajo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.materiaAprobada = materia;
		this.nota = nota;
	}

	private String nroLegajo;
	private String nombre;
	private String apellido;
	private Integer edad;
	private Integer nota;
	private String materiaAprobada;
	
	public String getMateriaAprobada() {
		return materiaAprobada;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public String toString() {
		return "Alumno [nroLegajo=" + nroLegajo + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", nota=" + nota + ", materiaAprobada=" + materiaAprobada + "]";
	}
	
	public Integer getNota() {
		return nota;
	}

	public Alumno compareNota(Alumno o) {
		return (this.getNota()>o.getNota()) ? this : o;
	}
	
	public Alumno cursoMateria(String nombre) { 
		return (nombre.equals(this.getMateriaAprobada()))?this:null;
	}
	
	
}
