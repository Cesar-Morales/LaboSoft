package ejercicio6;

import java.util.Arrays;
import java.util.Comparator;

public class EstudianteTest {
	
	public static void imprimir(Estudiante[] arr) {
		for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
        
	}
	
	public static void main(String[] args) {
		Estudiante[] arr= { new Estudiante("Morales", "Cesar", 26, 128618, 25),
							new Estudiante("Sanchez", "Ruperto", 25, 129988, 35),
							new Estudiante("Balasch", "Yanina", 30, 11111, 19),
							new Estudiante("Pipo", "Pepe", 99, 911111, 15),
							new Estudiante("Blanco", "Juan", 50, 111110, 915),
							new Estudiante("Garcia", "Luca", 90, 111101, 615),
							new Estudiante("Lopez", "Sofi", 20, 111011, 115),
							new Estudiante("Perez", "Ana", 10, 110111, 215),
							new Estudiante("Peres", "Ana", 10, 110111, 215),
							new Estudiante("Papa", "Ana", 10, 110111, 215),
							new Estudiante("Ana", "Ana", 10, 110111, 215)};
		
		System.out.println("----Desordenado----");
		 
        imprimir(arr);
		
        Arrays.sort(arr, new Comparator<Estudiante>() {

			@Override
			public int compare(Estudiante o1, Estudiante o2) {
				return o1.getMateriasAprobadas() - o2.getMateriasAprobadas();
			}
        });
        
        System.out.println("----Orden por materias acendente----");        
        
        imprimir(arr);
	
        Arrays.sort(arr, new Comparator<Estudiante>() {

			@Override
			public int compare(Estudiante o1, Estudiante o2) {
				return o2.getEdad() - o1.getEdad(); 
			}
        });
        
        System.out.println("----Orden por edad desendente----");  
        
        imprimir(arr);
        
        Arrays.sort(arr);
        
        System.out.println("----Orden por nombre y nombre ascendente----");  
        
        imprimir(arr);
	}
}
