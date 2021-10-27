package ejercicio1;

public class TestLuis {

	public static void main(String[] args) {
		Artista singleton = Artista.LUISALBERTOSINETTA;
		
		Melodia m1 = new Melodia(Notas.DO, 1);
		Melodia m2 = new Melodia(Notas.RE, 2);
		Melodia m3 = new Melodia(Notas.MI, 3);
		Melodia m4 = new Melodia(Notas.FA, 5);
		Melodia m5 = new Melodia(Notas.DO, 6);
		Melodia[] melodias = new Melodia[]{ m1, m2, m3,m4, m5 };
		
		singleton.tocarCancion(melodias);
	}
	
}
