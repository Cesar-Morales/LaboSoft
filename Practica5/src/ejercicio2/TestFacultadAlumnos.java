package ejercicio2;

public class TestFacultadAlumnos {

	public static void main(String[] args) {
		
		Alumno a1 = new Alumno("12777/7", "Pepe", "lope", 20, "Laboratorio de Software", 10);

		Alumno a2 = new Alumno("12734/8", "Pipo", "gonzales", 27, "IBBDD", 4);

		Alumno a3 = new Alumno("9999/7", "Maria", "calu", 30, "Laboratorio de Software", 9);

		Alumno a4 = new Alumno("22777/7", "Juan", "robert", 22, "Proyecto de Software", 7);

		Alumno a5 = new Alumno("122/7", "Peperulo", "roulo", 45, "Matematica", 8);
		
		Facultad UNLP = new Facultad();
		
		UNLP.agregarAlumnos(a1);
		UNLP.agregarAlumnos(a2);
		UNLP.agregarAlumnos(a3);
		UNLP.agregarAlumnos(a4);
		UNLP.agregarAlumnos(a5);
		
		//System.out.println(UNLP);
		//System.out.println(UNLP.notaMasAlta());
		//UNLP.imprimirDosEstudiantes();
		//UNLP.imprimirAlumnoQueCurso("Matematica"); true
		//UNLP.imprimirAlumnoQueCurso("Matematicas"); falso
		UNLP.imprimirAlumnoConPrimeraLetraIgualA('P');
	}
	
}
