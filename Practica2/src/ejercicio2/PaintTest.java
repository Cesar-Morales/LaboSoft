package ejercicio2;

import java.util.Arrays;

import geomeria.*;

public class PaintTest {
	
	static void imprimeArrayPersonas(FiguraGeometrica[] figuras) {
		int fin = figuras.length;
		for (int i = 0; i < fin; i++){
			figuras[i].dibujar();
			System.out.println("Area: " + figuras[i].area());
		}
	}
	
	public static void main(String[] args) {
		Paint p = new Paint();
		p.init();
		FiguraGeometrica[] figuras = p.getPaleta();
		System.out.println("------SIN ORDENAR------");
		imprimeArrayPersonas(figuras);
		Arrays.sort(figuras);
		System.out.println("-------ORDENADOS-------");
		imprimeArrayPersonas(figuras);
		
	}
}
		
			
