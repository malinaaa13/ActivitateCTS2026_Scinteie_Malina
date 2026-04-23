package factory_method.electronice.main;

import factory_method.electronice.clase.ProdusElectronic;
import factory_method.electronice.fabrici.*;

public class Main {
    public static void main(String[] args) {
        FabricaProdusElectronic fabricaTelefon = new FabricaTelefon();
        FabricaProdusElectronic fabricaLaptop = new FabricaLaptop();

        ProdusElectronic telefonSmart = fabricaTelefon.creareaProdus(TipTelefon.smartphone, 15.8, " verde");
        telefonSmart.afiseaza();

        ProdusElectronic telefonButoane = fabricaTelefon.creareaProdus(TipTelefon.telefon_cu_taste, 10, "negru");
        telefonButoane.afiseaza();

        ProdusElectronic laptopGaming = fabricaLaptop.creareaProdus(TipLaptop.laptop_gaming, 36.8, "rosu", 32);
        laptopGaming.afiseaza();

        ProdusElectronic laptopUltra = fabricaLaptop.creareaProdus(TipLaptop.ultrabook, 24, "gri", 16);
        laptopUltra.afiseaza();
    }
}
