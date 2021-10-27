package ejercicio3;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;

public class TestStringConvertSet {
	public static void main(String[] args) {
	
	/* StringConvertSet 1
		
		Set<Integer> set = new StringConverterSet();
		set.add(1);
		set.add(2);
		System.out.println("Size " + set.size());
		Iterator<Integer> it = set.iterator();
		System.out.println("Proximo? " +it.hasNext());
		System.out.println(it.next() == 1);
		System.out.println("Proximo? " +it.hasNext());
		System.out.println(it.next());
		System.out.println("Proximo? " +it.hasNext());
	
	*/

		
		
	/* StringConvertSet 2 */
  
        StringConverterSet<Integer> set = new StringConverterSet<>();

        //Probando el funcionamiento de instanceof
        //Serializable d = set.crear();
        //System.out.println("Es una instancia de Set? " + (d instanceof Set));
			
		set.add(2);
		set.add(3);
		set.add(2);
		
		Iterator<String> iterator = set.iterator();
		
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element + " - " + element.getClass());
		}
	}
}

