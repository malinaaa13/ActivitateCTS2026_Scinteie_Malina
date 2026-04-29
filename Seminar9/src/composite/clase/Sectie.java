package composite.clase;

public class Sectie implements Structura{
    private String numeSectie;
    private int nrAngajati;

    public Sectie(String nume, int nrAngajati) {
        this.numeSectie = nume;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public void afiseazaDetaliiStructura(String spatii) {
        System.out.println(spatii+"Nume sectie "+this.numeSectie+" si nr angajati "+this.nrAngajati);
    }
}
