package ejercicio1;

public class TestGuitarra {
	
	public static void main(String[] args) {
	
		Guitarra guitarra = new Guitarra();
		guitarra.afinar();
		System.out.println(guitarra.queEs());
		guitarra.hacerSonar();
		guitarra.afinar(FrecuenciasDeLA.F440Hz);
		guitarra.hacerSonar(Notas.DO, 1);
	}
}
