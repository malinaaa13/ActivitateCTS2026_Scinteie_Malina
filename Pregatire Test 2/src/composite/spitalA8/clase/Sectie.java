package composite.spitalA8.clase;

public class Sectie implements Structura{
    private String numeSectie;
    private int nrAngajati;

    public Sectie(String numeSectie, int nrAngajati) {
        this.numeSectie = numeSectie;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public void afiseazaDetaliiStructura(String spatii) {
        System.out.println(spatii+"Nume sectie "+this.numeSectie+" si nr angajati "+this.nrAngajati);
    }
}
