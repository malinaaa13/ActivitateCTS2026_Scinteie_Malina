package singleton.registry2.clase;

import java.util.HashMap;
import java.util.Map;

public class APIRestry {
    private static Map<String, IAPIConnection> collection = new HashMap<>();

    private APIRestry(){}

    public static void register (String name, IAPIConnection value)throws Exception {
        if(collection.containsKey(name)){
            throw new Exception("Key '"+name+"' already registered") ;
        }
        collection.put(name, value);
    }

    public static IAPIConnection getAPI(String name){
        return collection.get(name);
    }
}
