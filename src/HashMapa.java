package src;
import java.util.HashMap;
import java.util.Set;

public class HashMapa <E, T> implements Mapa <E, T> {

    private HashMap<E, T> hashmapa;

    public HashMapa(){
        this.hashmapa = new HashMap<E, T>();
    }

    @Override
    public void put(E clave, T valor) {
        this.hashmapa.put(clave, valor);
        
    }

    @Override
    public T get(E clave) {
        return this.hashmapa.get(clave);
    }

    @Override
    public void remove(E clave) {
        this.hashmapa.remove(clave);
    }

    @Override
    public void clear() {
        this.hashmapa.clear();
    }

    @Override
    public int size() {
        return this.hashmapa.size();
    }

    @Override
    public Set<E> keySet() {
        return this.hashmapa.keySet();
    }

}