package lambdaEjemplos;

public class TestMathOperation implements MathOperation{

	//Creamos una clase que implementa MathOperation
	//por lo tanto tenemos que implementar sus metodos
	//ES MUY LARGO! Creamos una clase para algo muy simple
	@Override
	public double operation(double a, double b) {
		return a + b;
	}
	
	
	public static void main(String[] args) {
		
		//Creamos una variable de tipo MathOperation (MO)
		//por lo que al hacer el "new" debo agregarle 
		//funcionalidad al metodo que implementa dicha interface
		//CLASES ANONIMAS, TAMBIEN DEMASIADO DETALLE!
		MathOperation addition = new MathOperation() {
			@Override
			public double operation(double a, double b) {
				return a + b;
			}
		};
		
		//Creamos una clase del tipo MO y le asignamos
		//una funcion lambda que se concatena a la que 
		//debo implementar por la interface
		//CODIGO CONCISO: EXPRESION LAMBDA
		MathOperation addition2 = (a, b) -> a + b;
		addition.operation(1, 2);
		addition2.operation(1, 2);
		
		Nombrar nombre = n -> {System.out.println(n);};
		Nombrar nombre2 = System.out::println;
		nombre.saludo("pepe");
		nombre2.saludo("pipo");
		
	}	
}
