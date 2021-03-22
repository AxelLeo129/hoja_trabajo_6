package src;
import java.io.*;
import java.util.*;

public class Lector {

    /**
     * Constructor vacio
     */
    public Lector() {}

    /**
     * @return devuelve la linea escrita en el txt
     */
    public static Tienda readFile(String tipoDeMapa) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String salida = "";
        Tienda elMapa = new Tienda();
        elMapa.setMap(tipoDeMapa);
        if (elMapa==null) return null;
        try {
            archivo = new File("assets/ListadoProducto.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String bfRead;
            while((bfRead = br.readLine() )!= null) {
                String separador = "\\|";
                String[] linea = br.readLine().split(separador);
                for (String i : linea) {
                    i = i.replaceAll("\\s", "");
                }
                //System.out.println("."+linea[0]+".");
                //System.out.println("."+linea[1]+".");
                elMapa.agregarElemento(linea[0], linea[1]);
            }
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
        return elMapa;

    }

}