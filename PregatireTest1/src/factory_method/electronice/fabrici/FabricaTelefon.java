package factory_method.electronice.fabrici;

import factory_method.electronice.clase.ProdusElectronic;
import factory_method.electronice.clase.Smartphone;
import factory_method.electronice.clase.Telefon;
import factory_method.electronice.clase.TelefonCuTaste;

public class FabricaTelefon implements FabricaProdusElectronic{

    @Override
    public ProdusElectronic creareaProdus(TipProdusElectronic tip, double display, String culoare) {
        switch (tip){
            case TipTelefon.smartphone -> {
                return new Smartphone(display, culoare);
            }
            case TipTelefon.telefon_cu_taste -> {
                return new TelefonCuTaste(display, culoare);
            }
            default -> {
                return null;
            }
        }
    }

    @Override
    public ProdusElectronic creareaProdus(TipProdusElectronic tip, double display, String culoare, int memorieRAM) {
        return this.creareaProdus(tip, display, culoare);
    }
}
