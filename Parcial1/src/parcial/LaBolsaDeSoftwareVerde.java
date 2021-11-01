package parcial;

import java.util.*;

public class LaBolsaDeSoftwareVerde {
	
	private List<Establecimiento> establecimientos = new ArrayList<Establecimiento>();
	private List<Propuesta> propuestasDeBolsones = new ArrayList<Propuesta>();
	private List<Verdura> verdurasCosechadas = new ArrayList<Verdura>();
	

	public void agregarPropuestas(Propuesta p) {
		propuestasDeBolsones.add(p);
	}
	
	public void agregarEstablecimiento(Establecimiento e) {
		establecimientos.add(e);
	}
	
	private void obtenerVerdurasCosechadas(Integer anio, Integer mes) {
		for(Establecimiento e: establecimientos) {
			Iterator<Verdura> iter = e.iteradorDeVerdurasCosechadas(anio, mes);
			while(iter.hasNext()) {
				Verdura v = iter.next();
				if(v != null) {
					verdurasCosechadas.add(v);
				}
			}
		}
	}
	
	private boolean includeElem(String s, Propuesta p) {
		for(String k: p.darmeClaves()) {
			if(k.equals(s)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean sePuedeArmarBolson(Integer anio, Integer mes, Propuesta propuestaDeBolsones) {
		obtenerVerdurasCosechadas(anio, mes);
		Integer cant = propuestaDeBolsones.darmeClaves().size();
		for(Verdura v: verdurasCosechadas) {
			String nom = v.getNombre();
			if(includeElem(nom,propuestaDeBolsones) && (propuestaDeBolsones.returnCant(nom) <= v.getCantidad())) {	
					cant--;
			}
		}
		if(cant.equals(0)) {			
			return true;
		}
		return false;
	}
	
	public int cantidadDeBolsones(Integer anio, Integer mes, Propuesta propuestaDeBolsones) {
		Integer total = 0;
		if(sePuedeArmarBolson(anio, mes, propuestaDeBolsones)) {
			total++;
		}
		return total;
	}
	
	public Map<Propuesta, Integer> bolsonesPorPropuesta(Integer anio, Integer mes){
		Map<Propuesta, Integer> map = new HashMap<Propuesta,Integer>();
		for (Propuesta p: propuestasDeBolsones) {
			map.put(p, cantidadDeBolsones(anio, mes, p));
		}
		return map;
	}
	
	
		

	public Map<Establecimiento, List<Verdura>> participacionPorEstablecimiento(){
		return null;
	}
		
	@Override
	public String toString() {
		return "LaBolsaDeSoftwareVerde \n\n\tEstablecimientos=" + establecimientos + ", \n\n\tpropuestasDeBolsones="
				+ propuestasDeBolsones + ", verdurasCosechadas=" + verdurasCosechadas + ".";
	}
}
