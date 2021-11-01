package parcial;

import java.util.HashMap;
import java.util.Map;

public class Propuesta {
	//Crea un diccionario vacio y lo voy cargando
	
	private Map<String,Integer> map = new HashMap<String, Integer>();

	public Map<String, Integer> getMap() {
		return map;
	}
	
	public boolean haveThisVegetable(String v) {
		if(map.get(v) == null ) {
			return false;
		}
		return true;
	}
	
	public Integer returnCant(String v) {
		return map.get(v);
	}

	public void addElement(String nombre, Integer cantidad) {
		this.map.put(nombre, cantidad);
	}
	
}
