package subiecte.cafenea.prototype;

import subiecte.cafenea.factory_clase.IBautura;

import java.util.HashMap;
import java.util.Map;

public class BauturaRegistry {
    private Map<String, IBautura> prototipuri = new HashMap<>();

    public void adaugaReteta(String numeReteta, IBautura bautura) {
        prototipuri.put(numeReteta, bautura);
    }

    public IBautura getReteta(String numeReteta) {
        IBautura prototip = prototipuri.get(numeReteta);
        if( prototip!= null){
            return prototip.copiaza();
        }
        return null;
    }
}
