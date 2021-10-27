

public class Vacuna {

	private String marca;
	private String paisOrigen;
	private String previeneEnf;
	private int dosisCant;
	
	public Vacuna() {
		this.paisOrigen = "ZZZ";
		this.previeneEnf = "ZZZ";
		this.dosisCant = -99999;
	}
	

	public Vacuna(String marca, String paisOrigen, String previeneEnf, int dosisCant) {
		super();
		this.marca = marca;
		this.paisOrigen = paisOrigen;
		this.previeneEnf = previeneEnf;
		this.dosisCant = dosisCant;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getPaisOrigen() {
		return paisOrigen;
	}



	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}



	public String getPrevieneEnf() {
		return previeneEnf;
	}



	public void setPrevieneEnf(String previeneEnf) {
		this.previeneEnf = previeneEnf;
	}



	public int getDosisCant() {
		return dosisCant;
	}



	public void setDosisCant(int dosisCant) {
		this.dosisCant = dosisCant;
	}
	
	
	/*Si no creo esto imprime NombreClase@Numero por ejemplo Vacuna@251a69d7*/
	@Override 
	public String toString() { 
		StringBuffer s = new StringBuffer("Vacuna [marca=" + marca + ", paisOrigen=" + paisOrigen +
		", previeneEnf=" + previeneEnf+ ", dosisCant=" + dosisCant + "]"); 
		String str = s.toString(); 
		return str; 
	}
	 


	

	public static void main(String[] args) {
		
	
	}

}
