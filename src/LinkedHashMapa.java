package src;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapa <E, T> implements Mapa <E, T>{

    private LinkedHashMap<E, T> hashmapa;

    public LinkedHashMapa() {
        this.hashmapa = new LinkedHashMap<E, T>();
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
