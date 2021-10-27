package geomeria;

public class PaintTest {
	public static void main(String[] args) {
		Paint p = new Paint();
		p.init();
		//System.out.println(((Circulo)p.getPaleta()[1]).getRadio());
		FiguraGeometrica[] figuras = p.getPaleta();
		int fin = p.getPaleta().length;
		for (int i = 0; i < fin; i++){
			figuras[i].dibujar();
			System.out.println("El area es de "+figuras[i].area());
			if (Circulo.class.isInstance(figuras[i])){
				System.out.println("El radio es de "+((Circulo) figuras[i]).getRadio());
			}
		}	
	}
}
