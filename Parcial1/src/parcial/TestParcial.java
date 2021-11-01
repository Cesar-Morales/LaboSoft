package parcial;

public class TestParcial {
	public static void main(String[] args) {
		
		//Creo verduras
		Verdura v1 = new Verdura("Lechuga", 3, true, 11,2021);
		Verdura v2 = new Verdura("Acelga", 4, false, 11,2021);
		Verdura v3 = new Verdura("Espinaca", 10, false, 11,2021);
		Verdura v4 = new Verdura("Remolacha", 6, true, 11,2021);
		Verdura v5 = new Verdura("Kale", 5, true, 11,2021);
		Verdura v6 = new Verdura("Pepino", 8, true, 11,2021);
		
		//Creo establecimiento
		Establecimiento e1 = new Establecimiento("Chacra 221");
		
		//Agrego cultivo
		e1.cargarCultivo(v1);
		e1.cargarCultivo(v2);
		e1.cargarCultivo(v3);
		e1.cargarCultivo(v4);
		e1.cargarCultivo(v5);
		e1.cargarCultivo(v6);
		
		//Creo la primer propuesta que se acepta
		Propuesta propu = new Propuesta();
		propu.addElement("Lechuga", 2);
		propu.addElement("Kale", 5);
		//propu.addElement("Pepino", 6); //TRUE "sePuedeArmarBolson"
		//propu.addElement("Pepino", 16); //FALSE "sePuedeArmarBolson"
		
		//Creo la segunda propuesta que no se acepta por fecha(espinaca)
		Propuesta propu2 = new Propuesta();
		propu2.addElement("Espinaca", 2);
		propu2.addElement("Remolacha", 5);
		
		//Creo la tercera propuesta que no se acepta por cantidad (pepinos)
		Propuesta propu3 = new Propuesta();
		propu3.addElement("Pepino", 9);
		propu3.addElement("Remolacha", 5);
				
		
		
		//Creo el sistema
		LaBolsaDeSoftwareVerde lbdsv = new LaBolsaDeSoftwareVerde();
		lbdsv.agregarEstablecimiento(e1);
		lbdsv.agregarPropuestas(propu);
		lbdsv.agregarPropuestas(propu2);
		lbdsv.agregarPropuestas(propu3);
	
		System.out.println(lbdsv.bolsonesPorPropuesta(2021, 11));
		
	//"sePuedeArmarBolson"
	//CASO TRUE:
	//	boolean asd = lbdsv.sePuedeArmarBolson(2021, 11, propu);
	//CASO FALSE:
	//	boolean asd = lbdsv.sePuedeArmarBolson(2031, 11, propu);
	//VERIFICACION:
	//	System.out.println(asd); 
		
	//"cantidadBolsones"	
	//	Integer asd1 = lbdsv.cantidadDeBolsones(2021, 10, propu); //0
	//	Integer asd1 = lbdsv.cantidadDeBolsones(2021, 11, propu); //1
	//	System.out.println(asd1);
		
		
	}
}
