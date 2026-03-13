package ro.ase.cts.simplefactory.main;

import ro.ase.cts.simplefactory.clase.factory.Factory;
import ro.ase.cts.simplefactory.clase.factory.TipTransport;
import ro.ase.cts.simplefactory.clase.mijlocdetransport.Autobuz;
import ro.ase.cts.simplefactory.clase.mijlocdetransport.MijlocDeTransport;

public class Main {
    public static void main(String[] args){
        Factory fabricaTransport = new Factory();
        MijlocDeTransport autobuz = fabricaTransport.getMijlocTransport(TipTransport.AUTOBUZ, "MAN", 102);
        autobuz.afiseazaTipTransport();
        MijlocDeTransport tramvai = fabricaTransport.getMijlocTransport(TipTransport.TRAMVAI, "Imporio", 41);
        tramvai.afiseazaTipTransport();
    }
}
