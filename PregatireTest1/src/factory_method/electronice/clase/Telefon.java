package factory_method.electronice.clase;

public abstract class Telefon implements ProdusElectronic{
    protected double dimensiuneDisplay;
    protected String culoare;

    public Telefon(double dimensiuneDisplay, String culoare) {
        this.dimensiuneDisplay = dimensiuneDisplay;
        this.culoare = culoare;
    }
}
