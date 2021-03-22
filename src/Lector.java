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
    public static Mapas readFile(String tipoDeMapa) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String salida = "";
        Mapas elMapa= FabricaMaps.FabricaMaps(tipoDeMapa);
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
                elMapa.agregarElemento(linea[0], linea[1]);
                System.out.println(linea[0]+": "+linea[1]);
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