package ro.ase.cts.clase;

public abstract class Supa implements FelDeMancare{
    protected float gramaj;
    protected String denumire;

    public Supa(float gramaj, String denumire) {
        this.gramaj = gramaj;
        this.denumire = denumire;
    }
}
