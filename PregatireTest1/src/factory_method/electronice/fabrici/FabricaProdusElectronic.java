package factory_method.electronice.fabrici;

import factory_method.electronice.clase.ProdusElectronic;

public interface FabricaProdusElectronic {
    ProdusElectronic creareaProdus(TipProdusElectronic tip, double display, String culoare);
    ProdusElectronic creareaProdus(TipProdusElectronic tip, double display, String culoare, int memorieRAM );

}
