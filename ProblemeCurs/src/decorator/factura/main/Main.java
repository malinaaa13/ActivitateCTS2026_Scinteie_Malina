package decorator.factura.main;

import decorator.factura.clase.Factura;
import decorator.factura.decorator.Decorator;
import decorator.factura.decorator.FacturaDecorata;

public class Main {
    public static void main(String[] args) {
        Factura factura = new Factura(2, 120.9);
        factura.printeaza();

        Decorator facturaDecorata = new FacturaDecorata(factura);
        facturaDecorata.aplicaDiscount(10);
        facturaDecorata.printeaza();

    }
}
