package Singleton;

public class TestPoolConexiones {
	public static void main(String[] args) {
		//Creacion
		PoolConexiones poolC = PoolConexiones.getSingletonInstance("Cesar");
		//Pruebo crear otro
		PoolConexiones poolC2 = PoolConexiones.getSingletonInstance("Luis");
		//Chequeo de que los dos sean el mismo
		poolC.getNombre();
		poolC2.getNombre();
		//Cambio a uno
		poolC.setNombre("Luis");
		//Chequeo los dos
		poolC.getNombre();
		poolC2.getNombre();
		//Cambio al otro
		poolC2.setNombre("Morales");
		//Chequeo a los dos
		poolC.getNombre();
		poolC2.getNombre();
	}
}
