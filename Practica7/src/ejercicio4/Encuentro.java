package ejercicio4;

public class Encuentro extends Partido implements Tormenta{
	Encuentro() throws Lluvia,FutbolException{}
	Encuentro (String fecha) throws Falta,
	FutbolException{}
	/*void penal() throws Mano{} NO FUNCIONA PORQUE PARTIDO.PENAR NO TIRA NINGUN ERROR, NO PUEDO HACER QUE UNA SUBCLASE TIRE UN NUEVO ERROR*/
	/*public void evento() throws Lluvia{}    NO FUNCIONA PORQUE TIENE QUE DEVOLVER ALGO QUE COMPRENDAN SUS DOS SUPERCLASES. NO PUEDE TIRAR UNA NUEVA EXCEPTION PARA NINGUNA DE LAS DOS FUNCIONES */
	public void diluvio() throws Lluvia{}
	public void evento(){}
	void jugada() throws Mano{}
	public static void main (String[] args) {
	try {
		Encuentro enc = new Encuentro();
		enc.jugada();
	} catch(Mano e) {
	} catch(Lluvia e) {
	} catch(FutbolException e) {
	//NO SE PUEDE LLAMAR DE LA MISMA FORMA QUE "e"
		try {
			Partido par = new Encuentro();
			par.jugada();
		} catch(EquipoIncompleto e1) {
		
		} catch(Falta e1) {
		
		} catch(Lluvia e1) {
		
		} catch(FutbolException e1) {}
		
		}
	}
}

//THROWS PROPAGA/DELEGA
//THROW CREA
//TRY PRUEBA
//CATCH MANEJA
//FINALLY SIEMPRE SE EJECUTA Y PISA A TRY
