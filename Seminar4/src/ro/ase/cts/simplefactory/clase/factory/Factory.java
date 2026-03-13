package ro.ase.cts.simplefactory.clase.factory;

import ro.ase.cts.simplefactory.clase.mijlocdetransport.*;

public class Factory {



    public MijlocDeTransport getMijlocTransport(TipTransport tip, String marca, Integer nrLinie){
        switch (tip){
            case TipTransport.AUTOBUZ->{
                return new Autobuz(nrLinie, marca);
            }
            case TipTransport.TRAMVAI -> {
                return new Tramvai(nrLinie, marca);
            }
            case TipTransport.TROLEIBUZ -> {
                return new Troleibuz(nrLinie, marca);
            }
            default -> {
                return null;
            }
        }
    }
}
