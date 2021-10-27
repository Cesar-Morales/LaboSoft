package ejercicio3;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StringConverterSet<E> extends AbstractSet<E>{

	private Set<E> set = new HashSet<E>();
	
	public boolean add(E o) {
		return set.add(o);
	}
	
	@Override
	public Iterator iterator() {
		return  new IteratorStringAdapter();
	}

	@Override
	public int size() {
		return set.size();
	}
	
	class IteratorStringAdapter implements Iterator{
		private Iterator<E> it = set.iterator();
		
		@Override
		public boolean hasNext() {
			return it.hasNext();
		}

		@Override
		public String next() {
			return it.next().toString();
		}
		
	}
	

}
