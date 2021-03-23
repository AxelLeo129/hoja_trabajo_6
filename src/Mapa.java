package src;

import java.util.Set;

public interface Mapa < E, T > {
    
    public void put(E clave, T valor);

    public T get(E clave);

    public void remove(E clave);

    public void clear();

    public int size();

    public Set<E> keySet();

}