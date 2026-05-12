package decorator.factura.clase;

public class Factura implements IFactura{

    private int codFactura;
    private double suma;

    public Factura(int codFactura, double suma) {
        this.codFactura = codFactura;
        this.suma = suma;
    }


    @Override
    public void printeaza() {
        System.out.println("Factura cu codul "+codFactura+" valoareaza "+suma+" lei");
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public double getSuma() {
        return suma;
    }
}
