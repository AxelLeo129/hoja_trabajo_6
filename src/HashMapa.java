package src;
import java.util.ArrayList;
import java.util.HashMap;
public class HashMapa implements Mapas{
    ArrayList<Producto> elValor;
    HashMap <String, ArrayList> miMapa;
    public HashMapa(){
        miMapa = new HashMap();
        elValor = new ArrayList<Producto>();
    }
    @Override
    public int size() {
        return miMapa.size();
    }

    @Override
    public void agregarElemento(String clave, String valor) {
        ArrayList<Producto> nuevoValor=null;
        for (String i: miMapa.keySet()){
            if(i.equals(clave)) {
                nuevoValor= miMapa.get(i);
                System.out.println("Llave encontrada");
                for(Producto j: nuevoValor){
                    System.out.println("--"+j.getNombre()+"--");
                    if(j.getNombre().equals(valor)) {
                        j.masUno();
                        System.out.println("Producto repetido, sumado uno al stock");
                        return;
                    }
                }
                System.out.println("Producto nuevo en sistema!");
                nuevoValor.add(new Producto(valor));
                System.out.println("Producto añadido");
                return;
            }
        }
        if(nuevoValor==null){
            System.out.println("Categoria nueva!");
            nuevoValor = new ArrayList<Producto>();
            nuevoValor.add(new Producto(valor));
            miMapa.put(clave, nuevoValor);
            System.out.println("Categoria y producto añadidos a catalogo");
            return;
        }

    }
    @Override
    public Boolean encontrarPorValor(String valor) {
        for (String i: miMapa.keySet()){
            ArrayList<Producto> val= miMapa.get(i);
            for (Producto j: val){
                if(j.getNombre().equals(valor)) return true;
            }
        }
       return false;
    }
    @Override
    public String mostrarCategoria(String nombreDeProducto) {
        for (String i: miMapa.keySet()){
            ArrayList<Producto> valor= miMapa.get(i);
            for (Producto j: valor){
                if(j.getNombre().equals(nombreDeProducto)) return "Categoria: "+i;
            }

    }
    return "El producto ingresado no fue encontrado";}
    @Override
    public String mostrarDatosDeProducto(String nombreDeProducto) {
            for (String i: miMapa.keySet()){
                ArrayList<Producto> valor= miMapa.get(i);
                for (Producto j: valor){
                    if(j.getNombre().equals(nombreDeProducto)) return "Categoria: "+i+"\n"+j.toString();
                }
            }
            return "El producto ingresado no fue encontrado";
    }

    @Override
    public String mostrarTodoInventario() {
        String res="******************";
        ArrayList<Producto> nuevoValor;
        for (String i:  miMapa.keySet()){
            res=res+"\nCategoria: "+i+".";
            nuevoValor= miMapa.get(i);
            for (Producto j:  nuevoValor){
                res=res+"\n - "+j.getNombre()+"\n\t -Stock: "+j.getCantidad();
            }
            res=res+"\n******************";
        }
        if(res.equals("******************")) res="No hay datos disponibles";
        System.out.println(res);
        return res;
    }
}
