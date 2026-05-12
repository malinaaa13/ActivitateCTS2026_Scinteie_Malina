package decorator.factura.decorator;

import decorator.factura.clase.Factura;
import decorator.factura.clase.IFactura;

public abstract class Decorator implements IFactura {
    protected Factura factura;

    public Decorator(Factura factura) {
        this.factura = factura;
    }

    @Override
    public void printeaza() {
        factura.printeaza();
        System.out.println("La multi ani!");
    }

    public abstract void aplicaDiscount(int procent);


}
