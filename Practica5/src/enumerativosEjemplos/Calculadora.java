package enumerativosEjemplos;

public enum Calculadora {
	SUMA("+"){
		double resolucion(double x, double y){
			return x + y;
		}
	},
	RESTA("-"){
		double resolucion(double x, double y){
			return x - y;
		}
	},
	MULTIPLICACION("*"){
		double resolucion(double x, double y){
			return x * y;
		}
	},
	DIVISION("/"){
		double resolucion(double x, double y){
			return x / y;
		}
	};
	
	
	private final String operador;
	
	Calculadora(String operador) {
		this.operador = operador;
	}
	
	@Override
	public String toString() {
		return operador;
	}

	abstract double resolucion(double x, double y);
}

