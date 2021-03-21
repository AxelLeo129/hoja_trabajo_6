package src;

public class FabricaMaps {
    public static Mapas FabricaMaps(String tipoDeMapAImplementar){
        switch(tipoDeMapAImplementar){
            case "HashMap": return new HashMapa();
            case "TreeMap": return new TreeMapa();
            case "LinkedHashMap": return new LinkedHashMapa();
            default: return null;
        }

    }
}
