package singleton.registry_echipamente.clase;

import java.util.HashMap;
import java.util.Map;

public class EchipamentRegistry {
    private static Map<String, IEchipament> collection = new HashMap<>();

    private EchipamentRegistry() {}

    public static void register(String name, IEchipament value) throws Exception {
        if(collection.containsKey(name)){
            throw new Exception("Key '"+name+"' already registered!");
        } else{
            collection.put(name, value);
        }
    }

    public static IEchipament getEchipament(String name){
        return collection.get(name);
    }
}
