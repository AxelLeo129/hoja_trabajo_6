package src;

/**
 * @author Axel Lopez
 * @author Luis Gonzalez
 * GIT: https://github.com/LPELCRACK896/hojaDeTrabajo4ALgoritmos.git
 */
public class Main {

    public static void main(String[] args){
        //Los productos tienen un \t  antes del nombre
        //Las categorias tienen un espacio al final
        Tienda miMapa;
        miMapa = Lector.readFile("HashMap");
        System.out.println("********************\n**********************\n*********************");
        miMapa.agregarElemento("Carnes ", "\tToro");
        miMapa.agregarElemento("Carnes ", "\tToro");
        System.out.println(miMapa.mostrarDatosDeProducto("\tToro"));
        System.out.println(miMapa.mostrarCategoria("\tToro"));
        //miMapa.mostrarTodoInventario();

    }
    
}
