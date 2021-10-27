
public class TestVacuna {

public static void main(String[] args) {
		
	/*
		Vacuna[] vacunas = new Vacuna[5];
		vacunas[0] = new Vacuna("Sputnik V", "Rusia", "Covid19", 2);
		vacunas[1] = new Vacuna("Astra zeneca", "Reino Unido", "Covid19", 2);
		vacunas[2] = new Vacuna("Janssen", "Belgica", "Covid19", 1);
		vacunas[3] = new Vacuna("Sinopharm", "China", "Covid19", 2);
		vacunas[4] = new Vacuna("Pfizer", "Estados Unidos & Alemania", "Covid19", 2);
		
		for (int i = 0; i < 5; i++){
			 System.out.println(vacunas[i].toString());
		}
		
		Vacuna aux = new Vacuna("Sputnik V", "Rusia", "Covid19", 2);
		System.out.println(vacunas[0].equals(aux));
	*/
	
	VacunaPatogenoIntegro vpi = new VacunaPatogenoIntegro("covid19");
	VacunaSubunidadAntigenica vsa = new VacunaSubunidadAntigenica(1, "tipo de proceso");
	VacunaGenerica vg = new VacunaGenerica(-20, 9);
	
	System.out.println(vpi.toString());
	System.out.println(vsa.toString());
	System.out.println(vg.toString());
	}
}
