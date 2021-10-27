package geomeria;

public class Circulo extends FiguraGeometrica{

	public int radio;
	
	public Circulo() {
		this.radio= 0;
	}
	
	public int area() {
		//pi por radio al cuadrado
		return (int)(Math.PI * Math.pow(this.radio, 2));
	}

	
	public void dibujar() {
		System.out.println("Circulo de radio "+this.radio+" y "
				+ "de color "+this.color+" dibujado");
	}


	public int getRadio() {
		return radio;
	}


	public void setRadio(int radio) {
		this.radio = radio;
	}
	

	
}
