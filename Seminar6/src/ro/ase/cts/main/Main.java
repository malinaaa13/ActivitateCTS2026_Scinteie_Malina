package ro.ase.cts.main;

//Factory method - Restaurant B3

import ro.ase.cts.clase.FelDeMancare;
import ro.ase.cts.fabrici.*;

public class Main {
    public static void main(String[] args) {

        FelDeMancareFabrica fabrica = new SupaFabrica();
        FelDeMancare supaCrema = fabrica.getFelDeMancare(TipSupa.SUPA_CREMA, 500, "ciuperci");
        FelDeMancare ciorba = fabrica.getFelDeMancare(TipSupa.CIORBA, 350, " de legume ");

        FelDeMancareFabrica fabrica2 = new DesertFabrica();
        FelDeMancare papanasi = fabrica2.getFelDeMancare(TipDesert.PAPANASI, 90, "visine", 400);
        FelDeMancare clatite = fabrica2.getFelDeMancare(TipDesert.CLATITE, 408, "capsuni", 600);

        supaCrema.afiseaza();
        ciorba.afiseaza();
        papanasi.afiseaza();
        clatite.afiseaza();

    }
}
