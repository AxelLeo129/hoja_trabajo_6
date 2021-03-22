package src;

public interface Mapas {
    int size();
    void agregarElemento(String clave, String valor);
    Boolean encontrarPorValor(String valor);
    String mostrarCategoria(String nombreDeProducto);//mostrar la cateogoria del produto ingresado
    String mostrarDatosDeProducto(String nombreDeProducto);//solo del producto ingersado
    String mostrarTodoInventario();//cateogorias y productos




}
