package ejercicio2;

import ejercicio2.InnerStatic.Circulo;

public class InnerTest {
	public static void main(String[] args) {
		//InnerStatic is = new InnerStatic();
		Circulo.getArea();
		Circulo.getLongitudCircunsferencia();
		
		Circulo.radio=3;
		Circulo.getArea();
		Circulo.getLongitudCircunsferencia();
		
		Circulo.radio=2;
		Circulo.getArea();
		Circulo.getLongitudCircunsferencia();
	}
}
