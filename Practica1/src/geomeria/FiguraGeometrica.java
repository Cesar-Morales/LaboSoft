package geomeria;

public abstract class FiguraGeometrica implements Comparable<FiguraGeometrica>{
	FiguraGeometrica fig1;
		
	@Override
	public int compareTo(FiguraGeometrica fig2) {
		if (this.area() <= fig2.area()) {
			return -1;
		} 
		return 1;
	}
	
	public String color;
	
	public FiguraGeometrica() {
		this.color = "null";
	}
	
	public abstract int area();

	public abstract void dibujar();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
