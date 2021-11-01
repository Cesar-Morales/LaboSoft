package parcial;

import java.util.*;

public class LaBolsaDeSoftwareVerde {
	
	private List<Establecimiento> establecimientos = new ArrayList<Establecimiento>();
	private List<Propuesta> propuestasDeBolsones = new ArrayList<Propuesta>();
	

	public void agregarPropuestas(Propuesta p) {
		propuestasDeBolsones.add(p);
	}
	
	public void agregarEstablecimiento(Establecimiento e) {
		establecimientos.add(e);
	}
	
	public boolean sePuedeArmarBolson(Integer anio, Integer mes, Propuesta propuestaDeBolsones) {
		for(Establecimiento e: establecimientos) {
			Iterator<Verdura> iter = e.iteradorDeVerdurasCosechadas(anio, mes);
			Integer cant = propuestaDeBolsones.getMap().size();
			while(iter.hasNext()) {
				Verdura v = iter.next();
				if(v != null) {
					String nom = v.getNombre();
					if(propuestaDeBolsones.haveThisVegetable(nom) 
							&& (v.getCosechada()) 
							&&(propuestaDeBolsones.returnCant(nom) <= v.getCantidad())) {
						cant--;
					}
				}
			}
			// si almenos 1 establecimiento puede armar bolson retorno TRUE
			if (cant.equals(0)) {
				return true;
			}
		}
		//si nadie puede armar bolson retornar FALSE!
		return false;
	}
	
	public int cantidadDeBolsones(Integer anio, Integer mes, Propuesta propuestaDeBolsones) {
		Integer total = 0;
		for(Establecimiento e: establecimientos) {
			Iterator<Verdura> iter = e.iteradorDeVerdurasCosechadas(anio, mes);
			Integer cant = propuestaDeBolsones.getMap().size();
			while(iter.hasNext()) {
				Verdura v = iter.next();
				if(v != null) {
					String nom = v.getNombre();
					if(propuestaDeBolsones.haveThisVegetable(nom) 
							&& (v.getCosechada()) 
							&&(propuestaDeBolsones.returnCant(nom) <= v.getCantidad())) {
						cant--;
					}
				}
			}
			// si almenos 1 establecimiento puede armar bolson retorno TRUE
			if (cant.equals(0)) {
				total++;
			}
		}
		return total;
	}
	
	public Map<Propuesta, Integer> bolsonesPorPropuesta(Integer anio, Integer mes){
		return null;
	}
	
	public Map<Establecimiento, List<Verdura>> participacionPorEstablecimiento(){
		return null;
	}
		
}
