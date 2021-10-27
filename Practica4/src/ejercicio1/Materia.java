package ejercicio1;

import java.util.ArrayList;
import java.util.Collection;

public class Materia {
	private String nombre;
	private Collection<Alumno> alumnos = new ArrayList<>();
	
	Materia(String nombre){
		this.nombre = nombre;	
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Collection<Alumno> getAlumnos() {
		return alumnos;
	}
	
	public void agregarAlumno(Alumno alu) {
		alumnos.add(alu);
	}

	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + ", alumnos=" + alumnos + "]";
	}
	
	
	
}
