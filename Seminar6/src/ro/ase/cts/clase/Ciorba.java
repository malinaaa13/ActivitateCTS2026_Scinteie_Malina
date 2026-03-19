package ro.ase.cts.clase;

public class Ciorba extends Supa{
    public Ciorba(float gramaj, String denumire) {
        super(gramaj, denumire);
    }

    @Override
    public void afiseaza() {
        System.out.println("Ciorba "+ super.denumire+" are "+super.gramaj+" grame");
    }
}
