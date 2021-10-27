package ejercicio2;

public class Test2 {
	
	public int unMetodo(){
		try {
			System.out.println("Va a retornar 1");
			return 1;
		} finally {
			System.out.println("Va a retornar 2");
			return 2;
		}
	}
	
	public static void main(String[] args) {
		Test2 res = new Test2();
		System.out.println(res.unMetodo());
	}
	
}

//	ERROR CON TRY Y FINALLY COMENTADO
//	Unresolved compilation problem: 
//  Unreachable code 
//  No llega a ejecutar el syso ni return 2



//	En la segunda return 2 le gana a 1. SI comento return 2 el que retrona es el 1




