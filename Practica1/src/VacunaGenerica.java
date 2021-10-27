
public class VacunaGenerica extends Vacuna{
	int tempMin;
	int temMax;
	
	public VacunaGenerica(int tempMin, int temMax) {
		super();
		this.tempMin = tempMin;
		this.temMax = temMax;
	}
	
	public int getTempMin() {
		return tempMin;
	}
	
	public void setTempMin(int tempMin) {
		this.tempMin = tempMin;
	}
	
	public int getTemMax() {
		return temMax;
	}
	
	public void setTemMax(int temMax) {
		this.temMax = temMax;
	}
	
}
