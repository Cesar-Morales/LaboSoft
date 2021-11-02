package enumerativosEjemplos;

public class TestEnum {
	public static void main(String[] args) {
		double num = 100;
		for(Calculadora c : Calculadora.values()) System.out.printf("%f %s %f = %f.%n",num,c,num,c.resolucion(num, num));
	}
}