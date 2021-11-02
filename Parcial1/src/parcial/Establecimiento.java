package parcial;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Establecimiento {

	private String nombre;
	private List<Verdura> tablaVerduras = new ArrayList<Verdura>();
	
	public Establecimiento(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Iterator<Verdura> iteradorDeVerdurasCosechadas(Integer anio, Integer mes){
		return new IteratorVerdurasCosechadas(anio, mes);
	}

	private class IteratorVerdurasCosechadas implements Iterator<Verdura>{
		Integer anio;
		Integer mes;
		private Iterator<Verdura> iter = tablaVerduras.iterator();
		
		
		public IteratorVerdurasCosechadas(Integer anio, Integer mes) {
			this.anio= anio;
			this.mes= mes;
		}

		@Override
        public boolean hasNext() {
            return iter.hasNext();
        }

        @Override
        public Verdura next() {
        	Verdura v = iter.next();
        	if (v.getAnio().equals(anio) && v.getMes().equals(mes) && v.getCosechada()) {
        		return v;
        	}
        	return null;
        }
	}
			
	@Override
	public String toString() {
		return "Nombre: "+ this.nombre +". \n\n\t\tTabla de verduras: "+this.tablaVerduras;
	}
	
	public void cargarCultivo(Verdura verdu) {
		tablaVerduras.add(verdu);
	}
	
}
