package singleton.registry.clase;

import java.util.HashMap;
import java.util.Map;

public class ResourceRegistry {
    private static Map<String, IResource> collection = new HashMap<>();

    private ResourceRegistry() {}

    public static IResource register(String name, IResource value) {
            if(collection.containsKey(name)){
                System.out.println("[WARNING] Resursa '"+ name +"' exista deja. Returnez instanta existenta");
                return collection.get(name);
            }
            else {
                collection.put(name, value);
                System.out.println("[INFO] Resursa '"+name+"' a fost inregistrata cu succes");
                return value;
            }
        }

    public static IResource getResursa(String name) {
        return collection.get(name);
    }
    }
