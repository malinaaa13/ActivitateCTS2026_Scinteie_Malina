package adapter.restaurantB5.main;

import adapter.restaurantB5.aplicatie_soft_facturi.AdapterSoftBar;
import adapter.restaurantB5.aplicatie_soft_bar.SoftBar;
import adapter.restaurantB5.aplicatie_soft_facturi.SoftFacturi;

public class Main {
    private static void afisareFactura(SoftFacturi softFacturi){
        softFacturi.printeazaFactura();
    }

    public static void main(String[] args) {
        SoftFacturi softFacturi = new SoftFacturi(4);
        afisareFactura(softFacturi);

        SoftBar softBar = new SoftBar(40.8, "Mohito");
        AdapterSoftBar softBarAdaptat = new AdapterSoftBar(5, softBar);
        afisareFactura(softBarAdaptat);
    }
}
