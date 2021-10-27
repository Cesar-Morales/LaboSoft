
public class VacunaSubunidadAntigenica extends Vacuna{
	int cantAntigenos;
	String tipoProceso;
	
	public VacunaSubunidadAntigenica(int cantAntigenos, String tipoProceso) {
		super();
		this.cantAntigenos = cantAntigenos;
		this.tipoProceso = tipoProceso;
	}
	
	public int getCantAntigenos() {
		return cantAntigenos;
	}
	
	public void setCantAntigenos(int cantAntigenos) {
		this.cantAntigenos = cantAntigenos;
	}
	
	public String getTipoProceso() {
		return tipoProceso;
	}
	
	public void setTipoProceso(String tipoProceso) {
		this.tipoProceso = tipoProceso;
	}
	
}
