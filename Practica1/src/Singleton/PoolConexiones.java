package Singleton;

public class PoolConexiones {

    private String nombre;
    private static PoolConexiones PoolConexiones;

    // El constructor es privado, no permite que se genere un constructor por defecto.
    private PoolConexiones(String nombre) {
        this.nombre = nombre;
        System.out.println("Mi nombre es: " + this.nombre);
    }
    
    //Forma de crear objeto
    public static PoolConexiones getSingletonInstance(String nombre) {
        if (PoolConexiones == null){
        	PoolConexiones = new PoolConexiones(nombre);
        }
        else{
            System.out.println("No se puede crear el objeto "+ nombre + " porque ya existe un objeto de la clase PoolConexiones");
        }
        
        return PoolConexiones;
    }
    
    public void getNombre() {
    	System.out.println("Mi nombre es: " + this.nombre);
    }
    
    public void setNombre(String name) {
    	this.nombre = name;
    	System.out.println("Nombre '"+name+"' seteado");
    }
    
}

