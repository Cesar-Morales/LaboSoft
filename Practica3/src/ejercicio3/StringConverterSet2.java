package ejercicio3;


import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Iterator;

public class StringConverterSet2<E> extends AbstractSet<E> {

    private HashSet<E> elements = new HashSet<>();

    //Se puede usar raw type para devolver aunque tenga un generico declarado.
    
    @Override
    public Iterator iterator() {
        return new IteratorStringAdapter();
    }

    //Tener en cuenta que el generico o el concreto va a influir en lo que devuelven los metodos
    //que se deben implementar. Por ejemplo si aca cambio String por E, el método next devuelve E
	//no String.
    
    private class IteratorStringAdapter implements Iterator{

        private Iterator<E> iterador = elements.iterator();

        @Override
        public boolean hasNext() {
            return iterador.hasNext();
        }

        @Override
        public String next() {
            return iterador.next().toString();
        }
    }

    @Override
    public boolean add(E e){
        return elements.add(e);
    }

    @Override
    public int size() {
        return elements.size();
    }


}


