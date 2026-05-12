package decorator.factura.decorator;

import decorator.factura.clase.Factura;

public class FacturaDecorata extends Decorator{
    public FacturaDecorata(Factura factura) {
        super(factura);
    }

    @Override
    public void aplicaDiscount(int procent) {
        super.factura.setSuma(super.factura.getSuma()*(100-procent)/100);
    }
}
