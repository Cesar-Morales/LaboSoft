package ejercicio2;
import static java.lang.Math.pow;


class InnerStatic {
	static double PI = 3.1416;
	static class Circulo {
		static double radio;
		static double getArea() {
			double a = PI * pow(radio, 2);
			System.out.println("El area es: " + a);
			return a;
		}
		static double getLongitudCircunsferencia() {
			double l = 2 * PI * radio;
			System.out.println("La longitud es: " + l);
			return l;
		}
	}
	/*public static void main(String[] args) {
		Circulo.radio=2;
	}*/
}
