package ejercicio5;

import java.util.*;

public class Stack {
	
	private ArrayList<Object> items = new ArrayList<Object>();	

	public Iterator<Object> iterator() {
		return new Iterator<Object>(){
			
			private Integer pos = 0;

			public boolean hasNext() {
				return (pos < items.size());
			}

			public Object next() {
				return (pos >= items.size()) ? "No se puede realizar el next()" : items.get(pos++);
			}		
		};
	}
	
	
	
	
	public void push(Object item) {
		items.add(item);
	}
	
	public Object pop() {
		if(items.isEmpty()) return "No se puede realizar el pop()";
		else return items.remove(items.size()-1);
	}
	
	public boolean isEmpty() {
		return items.isEmpty();
	}
	
	public void finalize() {
		
	}
	
}
