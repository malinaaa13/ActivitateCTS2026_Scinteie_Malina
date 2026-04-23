package subiecte.service2.factory.fabrica;

import subiecte.service2.factory.model.*;

public class FabricaComponente {
    public IComponenta creareComponenta(TipComponenta tip, double latime, double inaltime) {
        if (tip == TipComponenta.usa) {
            return new Usa(latime, inaltime);
        }
        return null;
    }

    public IComponenta creareComponenta(TipComponenta tip, double dimensiune) {
        if(tip == TipComponenta.bara){
            return new Bara(dimensiune);
        }
        return null;
    }

    public IComponenta creareComponenta(TipComponenta tip, String specificatie){
        switch (tip){
            case TipComponenta.capota -> {
                return new Capota(specificatie);
            }
            case TipComponenta.portbagaj -> {
                return new Portbagaj(specificatie);
            }
            default -> {return null;}
        }
    }

}
