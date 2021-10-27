package ejercicio2;

public class Test {
	public static void main(String[] args) {
		
		//NO FUNCIONA I
		//Veterinaria <Animal> vet = new Veterinaria <Gato>();
		
		
		
		//NO FUNCIONA II
		//Veterinaria <Gato> vet2 = new Veterinaria <Animal>();
		
		
		
		// NO funcion iii
		//Veterinaria <?> vet3 = new Veterinaria<Gato>(); //null
		//vet3.setAnimal(new Gato());
		
		
				
		/* FUNCIONA IV
		Veterinaria vet = new Veterinaria ();
		vet.setAnimal(new Perro());
		System.out.println(vet.getAnimal());
		vet.setAnimal(new Gato());
		System.out.println(vet.getAnimal());
		*/
		
		
		// NO funciona v
		//Veterinaria vet = new Veterinaria <?>();
	
		// FUNCIONA vi
		//Veterinaria <? extends Animal> vet = new Veterinaria<Gato>();
	
	}
}
