package subiecte.service1.simpletfactory.factory;

import subiecte.service1.simpletfactory.clase.SEDAN;
import subiecte.service1.simpletfactory.clase.SUV;
import subiecte.service1.simpletfactory.clase.VAN;
import subiecte.service1.singleton.AMasina;

public class Factory {

    public AMasina creareMasina(TipMasina tip,  String marca,
                                       String model,
                                       String nrImatriculare,
                                       int anFabricatie){

        switch (tip){
            case TipMasina.SUV -> {
                return new SUV(marca, model, nrImatriculare, anFabricatie);
            }
            case TipMasina.VAN -> {
                return new VAN(marca, model, nrImatriculare, anFabricatie);
            }
            case TipMasina.SEDAN -> {
                return new SEDAN(marca, model, nrImatriculare, anFabricatie);
            }
            default -> {
                return  null;
            }
        }
    }
}
