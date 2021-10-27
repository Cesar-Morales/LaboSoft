package ejercicio1;

import java.util.*;

import ejercicio1.Stack.StackIterator;

public class StackTest {
	public static void main(String[] args) {
		Stack pila = new Stack();
		Iterator itr = pila.iterator();
		System.out.println("HAS NEXT?");
		System.out.println(itr.hasNext());
		System.out.println("NEXT");
		System.out.println(itr.next());
		System.out.println(pila.pop()); //null
		System.out.println(pila.isEmpty()); //true
		pila.push("Hola");
		System.out.println(pila.pop()); //Hola
		pila.push("Chau");
		pila.push("Adios");
		System.out.println(pila.isEmpty()); //false	
		System.out.println(pila.pop()); //Adios
		System.out.println(pila.isEmpty()); //false
		pila.push("Cesar");
		pila.push("Luis");
		pila.push("Morales");
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
	}
}
