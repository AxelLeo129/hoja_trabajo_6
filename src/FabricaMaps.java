package src;

public class FabricaMaps {
    public static Mapa construir(String tipoDeMapAImplementar){
        switch(tipoDeMapAImplementar){
            case "HashMap": return new HashMapa();
            case "TreeMap": return new TreeMapa();
            case "LinkedHashMap": return new LinkedHashMapa();
            default: 
                System.out.println("No se reconoce el tipo de Mapa");
                return null;
        }

    }
}
