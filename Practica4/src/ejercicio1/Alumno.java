package ejercicio1;


public class Alumno implements Comparable<Alumno>{
	private String apellido;
	private String nombre;
	private Integer edad;
	private Integer leajo;
	private Integer materiasAprobadas;
	
	/*CONSTRUCTOR*/
	public Alumno(String apellido, String nombre, Integer edad, Integer leajo, Integer materiasAprobadas) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.edad = edad;
		this.leajo = leajo;
		this.materiasAprobadas = materiasAprobadas;
	}
	
	public String toString()
    {
        return this.nombre + " " + this.apellido + " "
            + this.edad + " " + this.leajo+ " " + this.materiasAprobadas;
    }
	
	
	
	
	/*GETTERS & SETTERS*/
	public String getApellido() {
		return apellido;
	}
		public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Integer getLeajo() {
		return leajo;
	}
	public void setLeajo(Integer leajo) {
		this.leajo = leajo;
	}
	public Integer getMateriasAprobadas() {
		return materiasAprobadas;
	}
	public void setMateriasAprobadas(Integer materiasAprobadas) {
		this.materiasAprobadas = materiasAprobadas;
	}

	public int compareTo(Alumno o) {
		int difNom= nombre.compareTo(o.getNombre());
		return (difNom != 0)? difNom: apellido.compareTo(o.getApellido());
	}
	
	
}
