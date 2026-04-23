package simple_factory.farmacie1.clase;

public abstract class MedicamentAbstract implements Medicament{
    protected double pret;
    protected String denumire;

    public MedicamentAbstract(double pret, String denumire) {
        this.pret = pret;
        this.denumire = denumire;
    }
}
