package src;
import java.util.Set;
import java.util.TreeMap;
public class TreeMapa <E, T> implements Mapa <E, T> {

    
    private TreeMap<E, T> hashmapa;

    public TreeMapa(){
        this.hashmapa = new TreeMap<E, T>();
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
