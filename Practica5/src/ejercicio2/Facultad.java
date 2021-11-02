package ejercicio2;

import java.util.ArrayList;
import java.util.List;


public class Facultad {
	List<Alumno> alumnos = new ArrayList<Alumno>();

	
	public void agregarAlumnos(Alumno a) {
		alumnos.add(a);
	}
	
	@Override
	public String toString() {
		return ""+alumnos;
	}
	
	public Alumno notaMasAlta() {
		CompararNumeros comp = (n1,n2)-> n1.compareNota(n2);  //uso de lambda
		Alumno max = new Alumno(null, null, null, null, null, 0);
		for (Alumno a: alumnos) {
			max = comp.mayor(a,max);
		}
		return max;
	}
	
	private Integer numeroRandom() {
		return (int) Math.floor(Math.random()*alumnos.size());
	}
	
	public void imprimirDosEstudiantes() {
		ObtenerAlumno obtAlu = a -> alumnos.get(numeroRandom());
		System.out.println(obtAlu.obtenerAlumno(alumnos));
		System.out.println(obtAlu.obtenerAlumno(alumnos));
	}
	
	public void imprimirAlumnoQueCurso(String nombre) {
		Alumno a = cursoMateria(nombre);
		System.out.println((a == null)?"Nadie curso esta materia":a);
	}
	
	private Alumno cursoMateria(String s) {
		PerteneceMateria interfaceAlumno = alu -> alu.cursoMateria(s);
		for(Alumno a: alumnos) {
			Alumno alumno = interfaceAlumno.perteneceA(a);
			if(alumno != null) {
				return alumno;
			}
		}
		return null;
	}
	
	
	
}
