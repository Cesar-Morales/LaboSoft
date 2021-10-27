package ejercicio1;


public class FacultadTest {
	
	public static void main(String[] args) {
		Materia mate = new Materia("Mate IV");
		System.out.println(mate.getAlumnos());
		mate.agregarAlumno(new Alumno("Morales", "Cesar", 26, 128618, 25));
		mate.agregarAlumno(new Alumno("Sanchez", "Ruperto", 25, 129988, 35));
		mate.agregarAlumno(new Alumno("Balasch", "Yanina", 30, 11111, 19));
		mate.agregarAlumno(new Alumno("Pipo", "Pepe", 99, 911111, 15));
		mate.agregarAlumno(new Alumno("Blanco", "Juan", 50, 111110, 915));
		mate.agregarAlumno(new Alumno("Garcia", "Luca", 90, 111101, 615));
		mate.agregarAlumno(new Alumno("Lopez", "Sofi", 20, 111011, 115));
		mate.agregarAlumno(new Alumno("Papa", "Ana", 10, 110111, 215));
		mate.agregarAlumno(new Alumno("Ana", "Ana", 10, 110111, 215));
		mate.agregarAlumno(new Alumno("Lopes", "Ana", 10, 110111, 215));
		//System.out.println(mate.getAlumnos()); //todos
		
		for (Alumno a: mate.getAlumnos()) System.out.println(a); //uno por uno
		
		/*new Estudiante("Morales", "Cesar", 26, 128618, 25),
		new Estudiante("Sanchez", "Ruperto", 25, 129988, 35),
		new Estudiante("Balasch", "Yanina", 30, 11111, 19),
		new Estudiante("Pipo", "Pepe", 99, 911111, 15),
		new Estudiante("Blanco", "Juan", 50, 111110, 915),
		new Estudiante("Garcia", "Luca", 90, 111101, 615),
		new Estudiante("Lopez", "Sofi", 20, 111011, 115),
		new Estudiante("Perez", "Ana", 10, 110111, 215),
		new Estudiante("Peres", "Ana", 10, 110111, 215),
		new Estudiante("Papa", "Ana", 10, 110111, 215),
		new Estudiante("Ana", "Ana", 10, 110111, 215)*/
	}
}
