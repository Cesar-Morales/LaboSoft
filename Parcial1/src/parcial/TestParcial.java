package parcial;

public class TestParcial {
	public static void main(String[] args) {
		Verdura v1 = new Verdura("Lechuga", 3, true, 11,2021);
		Verdura v2 = new Verdura("Acelga", 4, false, 11,2021);
		Verdura v3 = new Verdura("Espinaca", 10, false, 11,2021);
		Verdura v4 = new Verdura("Remolacha", 6, true, 11,2021);
		Verdura v5 = new Verdura("Kale", 5, true, 11,2021);
		Verdura v6 = new Verdura("Pepino", 8, true, 11,2021);
		Establecimiento e1 = new Establecimiento("Chacra 221");
		e1.cargarCultivo(v1);
		e1.cargarCultivo(v2);
		e1.cargarCultivo(v3);
		e1.cargarCultivo(v4);
		e1.cargarCultivo(v5);
		e1.cargarCultivo(v6);
		Propuesta propu = new Propuesta();
		propu.addElement("Lechuga", 2);
		propu.addElement("Kale", 5);
		propu.addElement("Pepino", 6); //true
		//propu.addElement("Pepino", 16); //FALSE
		LaBolsaDeSoftwareVerde lbdsv = new LaBolsaDeSoftwareVerde();
		lbdsv.agregarEstablecimiento(e1);
		lbdsv.agregarPropuestas(propu);
	// CASO TRUE:
	//	boolean asd = lbdsv.sePuedeArmarBolson(2021, 11, propu);
	//	System.out.println(asd); 
	//	Integer asd1 = lbdsv.cantidadDeBolsones(2021, 10, propu); //0
	//	Integer asd1 = lbdsv.cantidadDeBolsones(2021, 11, propu); //1
	//	System.out.println(asd1);
		
		
	}
}
