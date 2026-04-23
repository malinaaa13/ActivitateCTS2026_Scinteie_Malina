package subiecte.service1.simpletfactory.clase;

import subiecte.service1.singleton.AMasina;

public class SEDAN extends AMasina {
    public SEDAN(String marca, String model, String nrImatriculare, int anFabricatie) {
        super(marca, model, nrImatriculare, anFabricatie);
    }

    @Override
    public void seRepera() {
        System.out.println("Se repara masina");
    }
}
