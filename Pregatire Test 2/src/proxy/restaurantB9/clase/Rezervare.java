package proxy.restaurantB9.clase;

public class Rezervare implements IRezervare{

    private int codRezervare;
    private int nrPersoane;

    public Rezervare(int codRezervare, int nrPersoane) {
        this.codRezervare = codRezervare;
        this.nrPersoane = nrPersoane;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    @Override
    public void rezerva() {
        System.out.println("Rezervarea cu codul "+codRezervare+" a fost realizata cu succes!");
    }
}
