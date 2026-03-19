package ro.ase.cts.clase;

public class Clatite extends Desert{
    public Clatite(float gramaj, String denumire, int calorii) {
        super(gramaj, denumire, calorii);
    }

    @Override
    public void afiseaza() {
        System.out.println("Clatitele cu  "+ super.denumire+" are "+super.gramaj+" grame"+
                " si "+super.calorii+" calorii.");
    }
}
