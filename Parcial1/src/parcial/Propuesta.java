package parcial;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Propuesta {
	//Crea un diccionario vacio y lo voy cargando
	
	private Map<String,Integer> map = new HashMap<String, Integer>();

	public Map<String, Integer> getMap() {
		return map;
	}
	
	public Set<String> darmeClaves() {
		return map.keySet();
	}
	
	@Override
	public String toString() {
		return "\n\t\tPropuesta [map=" + map + "]";
	}

	public boolean tieneVerdura(String v) {
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
