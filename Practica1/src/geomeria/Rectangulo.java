package geomeria;


public class Rectangulo extends FiguraGeometrica{

	public int alto;
	public int ancho;
	
	public Rectangulo() {
		this.alto = 0;
		this.ancho= 0;
	}
	
	public Rectangulo(int alto, int ancho) {
		this.alto = alto;
		this.ancho = ancho;
	}

	public int area() {
		// Base por altura
		return alto * ancho;
	}

	public void dibujar() {
		System.out.println("Rectangulo de altura "+
				this.alto+", de ancho "+this.ancho+
				" y de color "+this.color+" dibujado");
	}

}
