package src;

import java.util.Scanner;

public class Vista {
    public static void execute(){
        String tipoDeMapa=null;
        boolean noSalir=true;
        Scanner sc = new Scanner(System.in);
        String opc="";
        System.out.println("Bienvenido al almacen... supongo");
        while(noSalir) {
            System.out.println("Para guardar los datos, que estructura de mapa desea?\n1. HashMap\n2. LinkedHashMap\n3. TreeMap");
            opc = sc.nextLine();
            noSalir=!(opc.equals("1")||opc.equals("2")||opc.equals("3"));
            tipoDeMapa=(opc.equals("1"))?"HashMap":(opc.equals("2"))?"LinkedHashMap":(opc.equals("3"))?"TreeMap":null;
            if(noSalir) System.out.println("Ingrese una opcion valida");
        }
        noSalir=true;
        System.out.println("Generando estructura");
        Tienda miTienda = Lector.readFile(tipoDeMapa);
        System.out.println("Estructura finalizada");
        System.out.println("Enter para continuar");
        sc.nextLine();
        while(noSalir) {
            while (noSalir) {
                System.out.println("¿Qué desea hacer?");
                System.out.println("1. Agregar producto\n2. Mostrar categoria de producto\n3. Mostrar datos del producto\n4. Mostrar inventario\n5. Salir ");
                opc = sc.nextLine();
                noSalir = !(opc.equals("1") || opc.equals("2") || opc.equals("3") || opc.equals("4")|| opc.equals("5"));
                if (noSalir) System.out.println("Ingrese una opcion valida");
            }
            noSalir = true;
            switch (opc) {
                case "1": {
                    String categoria;
                    String producto;
                    System.out.println("Ingrese el nombre del producto");
                    producto = sc.nextLine();
                    System.out.println("Ingrese la categoria del producto");
                    categoria = sc.nextLine();
                    miTienda.agregarElemento(categoria + " ", "\t" + producto);
                    break;
                }
                case "2": {
                    String producto;
                    System.out.println("Ingrese el nombre del producto");
                    producto = sc.nextLine();
                    System.out.println(miTienda.mostrarCategoria("\t"+producto));
                    break;
                }
                case "3": {
                    String producto;
                    System.out.println("Ingrese el nombre del producto");
                    producto = sc.nextLine();
                    System.out.println(miTienda.mostrarDatosDeProducto("\t"+producto));
                    break;
                }
                case "4": {
                    System.out.println(miTienda.mostrarTodoInventario());
                    break;
                }
                case "5": {
                    noSalir=false;
                    break;}
                default:
                    System.out.println("Ocurrio un error inesperado");
            }
        }

    }
}
