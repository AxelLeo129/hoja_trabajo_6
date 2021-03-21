package src;
import java.io.*;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Lector {

    /**
     * Constructor vacio
     */
    public Lector() {}

    /**
     * @return devuelve la linea escrita en el txt
     */
    public static void readFile(String tipoDeMapa) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String salida = "";

        try {
            archivo = new File("assets/ListadoProducto.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String separador="|";
            String[] linea = br.readLine().split(" |    ");
            System.out.println( linea[0]);

        } catch (Exception e) {
            salida = e.toString();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                salida = e2.toString();
            }
        }

    }

}