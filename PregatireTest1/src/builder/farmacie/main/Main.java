package builder.farmacie.main;

import builder.farmacie.clase.Factura;
import builder.farmacie.clase.FacturaBuilder;
import builder.farmacie.clase.IBuilder;

public class Main {
    public static void main(String[] args) {
        Factura factura = new Factura(2, true, true, false, true, 20, true);
        System.out.println(factura);

        IBuilder builder1 = new FacturaBuilder();
        Factura factura1 = builder1.build();
        System.out.println(factura1);

        Factura factura2 = new FacturaBuilder().setAreCardFidelitate(true).setPlataCard(true).setNrPungi(1).build();
        System.out.println(factura2);
    }
}
