package flyweight.stbF9.clase;

import java.util.HashMap;

public class FabricaDeLinii {
    private HashMap<Integer, IAutobuzLinie> linii;

    public FabricaDeLinii(){
        this.linii = new HashMap<Integer, IAutobuzLinie>();
    }

    public IAutobuzLinie getLinie(int cod) throws Exception{
        IAutobuzLinie linie = linii.get(cod);
        if( linie == null){
            throw new Exception("Nu a fost gasita linia");
        } else {
            return linie;
        }
    }

    public IAutobuzLinie getLinie(int cod, int nrLinie, String primaStatie, String ultimaStatie){
        IAutobuzLinie linie = linii.get(cod);
        if(linie == null){
            linie = new AutobuzLinie(cod, nrLinie, primaStatie, ultimaStatie);
            linii.put(cod, linie);
        }
        return linie;
    }
}
