package factory_method.electronice.clase;

public abstract class Laptop implements ProdusElectronic{
    protected double dimensiuneDisplay;
    protected String culoare;
    protected int memorieRAM;

    public Laptop(double dimensiuneDisplay, String culoare, int memorieRAM) {
        this.dimensiuneDisplay = dimensiuneDisplay;
        this.culoare = culoare;
        this.memorieRAM = memorieRAM;
    }
}
