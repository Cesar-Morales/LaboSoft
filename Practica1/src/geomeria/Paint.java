package geomeria;

public class Paint {
	private FiguraGeometrica[] paleta;

	public FiguraGeometrica[] getPaleta() {
		return paleta;
	}

	public void setPaleta(FiguraGeometrica[] paleta) {
		this.paleta = paleta;
	}
	
	public Paint() {
		this.paleta = new FiguraGeometrica[5];
	}
	
	public void init() {
		Rectangulo r1 = new Rectangulo(2,3);
		r1.setColor("verde");
		this.paleta[0]=r1;
		Circulo c1 = new Circulo();
		c1.setRadio(2);
		c1.setColor("azul");
		this.paleta[1]=c1;
		Rectangulo r2 = new Rectangulo(4,10);
		r2.setColor("rojo");
		this.paleta[2]=r2;
		Circulo c2 = new Circulo();
		c2.setRadio(3);
		c2.setColor("amarillo");
		this.paleta[3]=c2;
		Rectangulo r3 = new Rectangulo(10,20);
		r3.setColor("rosa");
		this.paleta[4]=r3;
	}
}
