package factory_method.electronice.fabrici;

import factory_method.electronice.clase.LaptopGaming;
import factory_method.electronice.clase.ProdusElectronic;
import factory_method.electronice.clase.Ultrabook;

public class FabricaLaptop implements FabricaProdusElectronic{

    @Override
    public ProdusElectronic creareaProdus(TipProdusElectronic tip, double display, String culoare) {
        return this.creareaProdus(tip, display, culoare, 16);
    }

    @Override
    public ProdusElectronic creareaProdus(TipProdusElectronic tip, double display, String culoare, int memorieRAM) {
        switch (tip){
            case TipLaptop.laptop_gaming -> {
                return new LaptopGaming(display,culoare, memorieRAM);
            }
            case TipLaptop.ultrabook -> {
                return new Ultrabook(display, culoare, memorieRAM);
            }
            default -> {
                return null;
            }
        }
    }
}
