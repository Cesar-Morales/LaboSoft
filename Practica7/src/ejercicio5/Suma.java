package ejercicio5;

public class Suma {

	public static void main(String[] args){
		int suma=0;
		for(int i=0;i<args.length;i++)	{
			try {
				int num = Integer.parseInt(args[i]);
				suma+= num;
			} catch (Exception e) {
				System.err.println("Elemento "+args[i] + " no valido! Por favor ingrese solo numeros.");
			}
		}
		System.out.print("La suma es:"+suma);
	}
	
}

