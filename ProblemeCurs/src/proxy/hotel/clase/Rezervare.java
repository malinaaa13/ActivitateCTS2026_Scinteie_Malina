package proxy.hotel.clase;

public class Rezervare implements IRezervare{

    private int nrNopti;
    private int codRezervare;

    public Rezervare(int nrNopti, int codRezervare) {
        this.nrNopti = nrNopti;
        this.codRezervare = codRezervare;
    }

    public int getNrNopti() {
        return nrNopti;
    }

    @Override
    public void anulare() {
        System.out.println("Rezervare cu codul "+codRezervare+" a fost anulata.");
    }
}
