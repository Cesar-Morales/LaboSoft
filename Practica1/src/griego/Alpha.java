package griego;

public class Alpha {
	//public int x; //inciso (b)
	//int x; //inciso (c) "es igual que poner package"
	//void unMetodoA(){ inciso (c)
	protected int x; //inciso (a y e)
	public void unMetodoA(){ //inciso (b)
		System.out.println("Un Método Público ALPHA"); 
	} 
	protected void otroMetodoA(){ 
		System.out.println("Un método protegido DELTA"); 
	}

}
