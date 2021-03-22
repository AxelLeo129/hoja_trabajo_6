package src;

public class Producto {
    private String nombre;
    private int cantidad;
    public Producto(String nombre ){
        cantidad=1;
        this.nombre=nombre;
    }
    public void masUno(){
        cantidad++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
